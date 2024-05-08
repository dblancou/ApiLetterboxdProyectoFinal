package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.MovieListDTO;

import java.util.List;

public interface MovieListServiceI {
    MovieListDTO createMovieList(MovieListDTO movieListDTO);
    MovieListDTO updateMovieList(MovieListDTO movieListDTO);
    void deleteMovieList(Long listId);
    MovieListDTO getMovieListById(Long listId);
    List<MovieListDTO> getAllMovieLists();
    List<MovieListDTO> getMovieListsByUser(Long userId);
}
