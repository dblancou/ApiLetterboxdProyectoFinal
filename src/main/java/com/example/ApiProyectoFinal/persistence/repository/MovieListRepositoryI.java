package com.example.ApiProyectoFinal.persistence.repository;

import com.example.ApiProyectoFinal.persistence.model.MovieList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieListRepositoryI extends JpaRepository<MovieList, Long> {
    List<MovieList> findByUserUserId(Long userId);
    List<MovieList> findByUserUsername(String username); // Agrega este método
}
