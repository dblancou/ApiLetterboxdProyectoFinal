package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.ReviewDTO;
import com.example.ApiProyectoFinal.persistence.model.Film;
import com.example.ApiProyectoFinal.persistence.model.Review;
import com.example.ApiProyectoFinal.persistence.model.User;
import com.example.ApiProyectoFinal.persistence.repository.FilmRepositoryI;
import com.example.ApiProyectoFinal.persistence.repository.ReviewRepositoryI;
import com.example.ApiProyectoFinal.persistence.repository.UserRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImpl implements ReviewServiceI {
    @Autowired
    private ReviewRepositoryI reviewRepository;

    @Autowired
    private UserRepositoryI userRepository; // Añadir inyección de UserRepository
    @Autowired
    private FilmRepositoryI filmRepository; // Añadir inyección de FilmRepository

    @Override
    public ReviewDTO createReview(ReviewDTO reviewDTO) {
        Review review = convertToEntity(reviewDTO);
        review = reviewRepository.save(review);
        return convertToDTO(review);
    }

    @Override
    public ReviewDTO updateReview(ReviewDTO reviewDTO) {
        Review review = convertToEntity(reviewDTO);
        review = reviewRepository.save(review);
        return convertToDTO(review);
    }

    @Override
    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }

    @Override
    public ReviewDTO getReviewById(Long reviewId) {
        Review review = reviewRepository.findById(reviewId)
                .orElseThrow(() -> new RuntimeException("Review not found"));
        return convertToDTO(review);
    }

    @Override
    public List<ReviewDTO> getReviewsByFilm(Long filmId) {
        return reviewRepository.findByFilmFilmId(filmId).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ReviewDTO> getReviewsByUser(Long userId) {
        return reviewRepository.findByUserUserId(userId).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ReviewDTO> getReviewsByUserId(Long userId) {
        return reviewRepository.findByUserUserId(userId).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }


    @Override
    public List<ReviewDTO> getReviewsByFilmId(Long filmId) {
        return reviewRepository.findByFilmFilmId(filmId).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ReviewDTO> getAllReviews() {
        List<Review> reviews = reviewRepository.findAll();
        return reviews.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ReviewDTO convertToDTO(Review review) {
        ReviewDTO dto = new ReviewDTO();
        dto.setReviewId(review.getReviewId());
        dto.setUserId(review.getUser().getUserId());
        dto.setUserName(review.getUser().getUsername()); // Añadido
        dto.setFilmId(review.getFilm().getFilmId());
        dto.setTitle(review.getFilm().getTitle()); // Añadido
        dto.setPosterUrl(review.getFilm().getPosterUrl()); // Añadido
        dto.setContent(review.getContent());
        dto.setRating(review.getRating());
        dto.setReviewDate(review.getReviewDate());
        return dto;
    }

    private Review convertToEntity(ReviewDTO reviewDTO) {
        Review review = new Review();
        review.setReviewId(reviewDTO.getReviewId());

        // Asegúrate de obtener y asignar correctamente las entidades User y Film
        User user = userRepository.findById(reviewDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));
        review.setUser(user);

        Film film = filmRepository.findById(reviewDTO.getFilmId())
                .orElseThrow(() -> new RuntimeException("Film not found"));
        review.setFilm(film);

        review.setContent(reviewDTO.getContent());
        review.setRating(reviewDTO.getRating());
        review.setReviewDate(reviewDTO.getReviewDate());
        return review;
    }
}

