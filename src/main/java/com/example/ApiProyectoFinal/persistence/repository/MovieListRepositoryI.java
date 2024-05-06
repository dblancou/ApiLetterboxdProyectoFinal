package com.example.ApiProyectoFinal.persistence.repository;

import com.example.ApiProyectoFinal.persistence.model.MovieList;
import com.example.ApiProyectoFinal.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MovieListRepositoryI extends JpaRepository<MovieList, Long> {

    // Encuentra listas de películas por usuario
    List<MovieList> findByUser(User user);

    // Encuentra listas de películas por el nombre de la lista
    List<MovieList> findByNameContaining(String name);

    // Encuentra todas las listas de películas de un usuario ordenadas por la fecha de creación
    List<MovieList> findByUserOrderByCreatedAtDesc(User user);

}
