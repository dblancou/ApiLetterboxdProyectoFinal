package com.example.ApiProyectoFinal.persistence.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;  // Referencia al usuario que escribió la reseña

    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;  // Referencia a la película reseñada

    @NotBlank(message = "Review content cannot be empty")
    @Size(min = 10, message = "Review must be at least 10 characters long")
    @Column(name = "content", nullable = false)
    private String content;  // Contenido textual de la reseña

    @NotNull(message = "Rating cannot be null")
    @Column(name = "rating", nullable = false)
    private Double rating;  // Calificación dada a la película

    @CreationTimestamp
    @Column(name = "review_date", nullable = false, updatable = false)
    private LocalDateTime reviewDate;  // Fecha de creación de la reseña
}
