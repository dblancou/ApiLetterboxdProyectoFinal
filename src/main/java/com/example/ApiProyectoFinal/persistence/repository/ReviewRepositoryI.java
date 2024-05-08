package com.example.ApiProyectoFinal.persistence.repository;

import com.example.ApiProyectoFinal.persistence.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepositoryI extends JpaRepository<Review, Long> {

    List<Review> findByUserUserId(Long userId);  // Corregido para usar la navegación correcta de propiedades
    List<Review> findByFilmFilmId(Long filmId);  // Asegúrate de que 'Film' también use 'filmId' y no simplemente 'id'
}
