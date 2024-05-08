package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.FilmDTO;

import java.util.List;

public interface FilmServiceI {
    FilmDTO createFilm(FilmDTO filmDTO);
    FilmDTO updateFilm(FilmDTO filmDTO);
    void deleteFilm(Long filmId);
    FilmDTO getFilmById(Long filmId);
    List<FilmDTO> getAllFilms();
    List<FilmDTO> findByGenre(String genreName);
    List<FilmDTO> findByDirector(String director);
}
