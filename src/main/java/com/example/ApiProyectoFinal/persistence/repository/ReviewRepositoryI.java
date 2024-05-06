package com.example.ApiProyectoFinal.persistence.repository;

import com.example.ApiProyectoFinal.persistence.model.Review;
import com.example.ApiProyectoFinal.persistence.model.User;
import com.example.ApiProyectoFinal.persistence.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ReviewRepositoryI extends JpaRepository<Review, Long> {
    // Encuentra todas las reseñas por el ID de usuario
    List<Review> findByUserUserId(Long userId);

    // Encuentra todas las reseñas por el ID de la película
    List<Review> findByFilmFilmId(Long filmId);
}
