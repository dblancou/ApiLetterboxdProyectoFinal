package com.example.ApiProyectoFinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long reviewId;
    private Long userId;
    private Long filmId;
    private String content;
    private Double rating;
    private LocalDateTime reviewDate;
}
