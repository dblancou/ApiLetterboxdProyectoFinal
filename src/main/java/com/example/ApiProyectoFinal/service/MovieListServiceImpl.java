package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.FilmDTO;
import com.example.ApiProyectoFinal.dto.MovieListDTO;
import com.example.ApiProyectoFinal.persistence.model.Film;
import com.example.ApiProyectoFinal.persistence.model.MovieList;
import com.example.ApiProyectoFinal.persistence.repository.FilmRepositoryI;
import com.example.ApiProyectoFinal.persistence.repository.MovieListRepositoryI;
import com.example.ApiProyectoFinal.persistence.repository.UserRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieListServiceImpl implements MovieListServiceI {
    @Autowired
    private MovieListRepositoryI movieListRepository;
    @Autowired
    private UserRepositoryI userRepository;
    @Autowired
    private FilmRepositoryI filmRepository;

    @Override
    public MovieListDTO createMovieList(MovieListDTO movieListDTO) {
        MovieList movieList = convertToEntity(movieListDTO);
        movieList = movieListRepository.save(movieList);
        return convertToDTO(movieList);
    }

    @Override
    public MovieListDTO updateMovieList(MovieListDTO movieListDTO) {
        // Verificar si la lista existe antes de actualizar
        MovieList existingMovieList = movieListRepository.findById(movieListDTO.getListId())
                .orElseThrow(() -> new RuntimeException("MovieList not found"));

        // Convertir el DTO a la entidad y preservar las películas existentes
        existingMovieList.setName(movieListDTO.getName());
        existingMovieList.setDescription(movieListDTO.getDescription());
        List<Film> existingFilms = existingMovieList.getFilms();

        // Agregar las nuevas películas
        List<Film> newFilms = movieListDTO.getFilms().stream()
                .map(filmDTO -> filmRepository.findById(filmDTO.getFilmId())
                        .orElseThrow(() -> new RuntimeException("Film not found")))
                .collect(Collectors.toList());

        // Combinar las listas sin duplicados
        for (Film newFilm : newFilms) {
            if (!existingFilms.contains(newFilm)) {
                existingFilms.add(newFilm);
            }
        }

        existingMovieList.setFilms(existingFilms);
        existingMovieList = movieListRepository.save(existingMovieList);

        return convertToDTO(existingMovieList);
    }



    @Override
    public void deleteMovieList(Long listId) {
        movieListRepository.deleteById(listId);
    }

    @Override
    public MovieListDTO getMovieListById(Long listId) {
        MovieList movieList = movieListRepository.findById(listId)
                .orElseThrow(() -> new RuntimeException("MovieList not found"));
        return convertToDTO(movieList);
    }

    @Override
    public List<MovieListDTO> getAllMovieLists() {
        List<MovieList> movieLists = movieListRepository.findAll();
        return movieLists.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public List<MovieListDTO> getMovieListsByUser(Long userId) {
        List<MovieList> movieLists = movieListRepository.findByUserUserId(userId);
        return movieLists.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private MovieListDTO convertToDTO(MovieList movieList) {
        return new MovieListDTO(movieList.getId(), movieList.getUser().getUserId(),
                movieList.getName(), movieList.getDescription(), movieList.getCreatedAt(),
                movieList.getFilms().stream().map(film -> new FilmDTO(film.getFilmId(),
                        film.getTitle(), film.getDirector(), film.getYear(),
                        film.getGenre().getName(), film.getDescription(),
                        film.getImdbRating(), film.getPosterUrl())).collect(Collectors.toList()));
    }

    private MovieList convertToEntity(MovieListDTO movieListDTO) {
        MovieList movieList = new MovieList();
        movieList.setId(movieListDTO.getListId());  // Asegurarse de asignar el ID
        movieList.setName(movieListDTO.getName());
        movieList.setDescription(movieListDTO.getDescription());
        movieList.setUser(userRepository.findById(movieListDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found")));
        movieList.setFilms(movieListDTO.getFilms().stream()
                .map(filmDTO -> filmRepository.findById(filmDTO.getFilmId())
                        .orElseThrow(() -> new RuntimeException("Film not found")))
                .collect(Collectors.toList()));
        return movieList;
    }

}
