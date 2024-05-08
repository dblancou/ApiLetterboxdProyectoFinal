package com.example.ApiProyectoFinal.persistence.repository;

import com.example.ApiProyectoFinal.persistence.model.MovieList;
import com.example.ApiProyectoFinal.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieListRepositoryI extends JpaRepository<MovieList, Long> {
    // Métodos existentes...
    List<MovieList> findByUser(User user);
    List<MovieList> findByNameContaining(String name);
    List<MovieList> findByUserOrderByCreatedAtDesc(User user);

    // Corregido para usar la navegación correcta de propiedades
    List<MovieList> findByUserUserId(Long userId);  // Utiliza el nombre correcto de la propiedad en User
}
