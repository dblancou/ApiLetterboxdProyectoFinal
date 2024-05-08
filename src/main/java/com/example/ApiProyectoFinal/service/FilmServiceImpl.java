package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.FilmDTO;
import com.example.ApiProyectoFinal.persistence.model.Film;
import com.example.ApiProyectoFinal.persistence.repository.FilmRepositoryI;
import com.example.ApiProyectoFinal.service.FilmServiceI;
import org.springframework.beans.factory.annotation.Autowired;
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

    private FilmDTO convertToDTO(Film film) {
        FilmDTO dto = new FilmDTO();
        dto.setFilmId(film.getFilmId());
        dto.setTitle(film.getTitle());
        dto.setDirector(film.getDirector());
        dto.setYear(film.getYear());
        dto.setGenreName(film.getGenre().getName());
        dto.setDescription(film.getDescription());
        dto.setImdbRating(film.getImdbRating());
        dto.setPosterUrl(film.getPosterUrl());
        return dto;
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
        return film;
    }
}
