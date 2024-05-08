package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.ReviewDTO;
import java.util.List;

public interface ReviewServiceI {
    ReviewDTO createReview(ReviewDTO reviewDTO);
    ReviewDTO updateReview(ReviewDTO reviewDTO);
    void deleteReview(Long reviewId);
    ReviewDTO getReviewById(Long reviewId);
    List<ReviewDTO> getReviewsByFilm(Long filmId);
    List<ReviewDTO> getReviewsByUser(Long userId);
    List<ReviewDTO> getReviewsByUserId(Long userId);  // Asegúrate de que este método está aquí
    List<ReviewDTO> getReviewsByFilmId(Long filmId);  // Asegúrate de que este método está aquí
    List<ReviewDTO> getAllReviews();  // Agregar este método


}
