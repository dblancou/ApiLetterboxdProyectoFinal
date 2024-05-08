package com.example.ApiProyectoFinal.service;

import com.example.ApiProyectoFinal.dto.ReviewDTO;
import com.example.ApiProyectoFinal.persistence.model.Review;
import com.example.ApiProyectoFinal.persistence.repository.ReviewRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImpl implements ReviewServiceI {
    @Autowired
    private ReviewRepositoryI reviewRepository;

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
        return null;
    }

    @Override
    public List<ReviewDTO> getReviewsByUser(Long userId) {
        return null;
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


    private ReviewDTO convertToDTO(Review review) {
        return new ReviewDTO(review.getReviewId(), review.getUser().getUserId(),
                review.getFilm().getFilmId(), review.getContent(),
                review.getRating(), review.getReviewDate());
    }

    private Review convertToEntity(ReviewDTO reviewDTO) {
        Review review = new Review();
        // Fields would be set similarly to convertToDTO's logic
        return review;
    }

    @Override
    public List<ReviewDTO> getAllReviews() {
        List<Review> reviews = reviewRepository.findAll();
        return reviews.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
}
