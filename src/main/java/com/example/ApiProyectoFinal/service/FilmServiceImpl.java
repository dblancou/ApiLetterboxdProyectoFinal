package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.FilmDTO;
import com.example.ApiProyectoFinal.persistence.model.Film;
import com.example.ApiProyectoFinal.persistence.model.Genre;
import com.example.ApiProyectoFinal.persistence.repository.FilmRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmServiceImpl implements FilmServiceI {
    @Autowired
    private FilmRepositoryI filmRepository;

    @Override
    public FilmDTO createFilm(FilmDTO filmDTO) {
        Film film = convertToEntity(filmDTO);
        Film savedFilm = filmRepository.save(film);
        return convertToDTO(savedFilm);
    }

    @Override
    public FilmDTO updateFilm(FilmDTO filmDTO) {
        Film film = convertToEntity(filmDTO);
        Film updatedFilm = filmRepository.save(film);
        return convertToDTO(updatedFilm);
    }

    @Override
    public void deleteFilm(Long filmId) {
        filmRepository.deleteById(filmId);
    }

    @Override
    public FilmDTO getFilmById(Long filmId) {
        Film film = filmRepository.findById(filmId).orElseThrow(() -> new RuntimeException("Film not found"));
        return convertToDTO(film);
    }

    @Override
    public List<FilmDTO> getAllFilms() {
        List<Film> films = filmRepository.findAll();
        return films.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public List<FilmDTO> findByGenre(String genreName) {
        List<Film> films = filmRepository.findByGenreName(genreName);
        return films.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public List<FilmDTO> findByDirector(String director) {
        List<Film> films = filmRepository.findByDirector(director);
        return films.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public List<FilmDTO> getLatestFilms(int limit, String sortOrder) {
        PageRequest pageRequest = PageRequest.of(0, limit);
        List<Film> films = filmRepository.findLatestFilms(pageRequest);
        return films.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public List<FilmDTO> getTopRatedFilms(int limit) {
        List<Film> films = filmRepository.findTop8ByOrderByImdbRatingDesc();
        return films.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private FilmDTO convertToDTO(Film film) {
        FilmDTO filmDTO = new FilmDTO();
        filmDTO.setFilmId(film.getFilmId());
        filmDTO.setTitle(film.getTitle());
        filmDTO.setDirector(film.getDirector());
        filmDTO.setYear(film.getYear());
        if (film.getGenre() != null) {
            filmDTO.setGenreName(film.getGenre().getName());
        } else {
            filmDTO.setGenreName(null);
        }
        filmDTO.setDescription(film.getDescription());
        filmDTO.setImdbRating(film.getImdbRating());
        filmDTO.setPosterUrl(film.getPosterUrl());
        return filmDTO;
    }

    private Film convertToEntity(FilmDTO filmDTO) {
        Film film = new Film();
        film.setFilmId(filmDTO.getFilmId());
        film.setTitle(filmDTO.getTitle());
        film.setDirector(filmDTO.getDirector());
        film.setYear(filmDTO.getYear());
        film.setDescription(filmDTO.getDescription());
        film.setImdbRating(filmDTO.getImdbRating());
        film.setPosterUrl(filmDTO.getPosterUrl());
        // Asigna el género
        if (filmDTO.getGenreName() != null) {
            Genre genre = new Genre();
            genre.setName(filmDTO.getGenreName());
            film.setGenre(genre);
        }
        return film;
    }
}
