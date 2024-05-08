package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.FilmDTO;
import com.example.ApiProyectoFinal.dto.MovieListDTO;
import com.example.ApiProyectoFinal.persistence.model.MovieList;
import com.example.ApiProyectoFinal.persistence.repository.MovieListRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieListServiceImpl implements MovieListServiceI {
    @Autowired
    private MovieListRepositoryI movieListRepository;

    @Override
    public MovieListDTO createMovieList(MovieListDTO movieListDTO) {
        MovieList movieList = convertToEntity(movieListDTO);
        movieList = movieListRepository.save(movieList);
        return convertToDTO(movieList);
    }

    @Override
    public MovieListDTO updateMovieList(MovieListDTO movieListDTO) {
        MovieList movieList = convertToEntity(movieListDTO);
        movieList = movieListRepository.save(movieList);
        return convertToDTO(movieList);
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
        return null;
    }

    private MovieListDTO convertToDTO(MovieList movieList) {
        return new MovieListDTO(movieList.getId(), movieList.getUser().getUserId(),
                movieList.getName(), movieList.getCreatedAt(),
                movieList.getFilms().stream().map(film -> new FilmDTO(film.getFilmId(),
                        film.getTitle(), film.getDirector(), film.getYear(),
                        film.getGenre().getName(), film.getDescription(),
                        film.getImdbRating(), film.getPosterUrl())).collect(Collectors.toList()));
    }

    private MovieList convertToEntity(MovieListDTO movieListDTO) {
        MovieList movieList = new MovieList();
        // Fields would be set similarly to convertToDTO's logic
        return movieList;
    }
}
