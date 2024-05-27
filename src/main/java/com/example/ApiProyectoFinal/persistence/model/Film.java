package com.example.ApiProyectoFinal.persistence.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "Films")
@NoArgsConstructor
@AllArgsConstructor
public class Film implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Long filmId;

    @Column(name = "title", nullable = false)
    @NotBlank(message = "The title cannot be empty")
    private String title;

    @Column(name = "director", nullable = false)
    @NotBlank(message = "The director cannot be empty")
    private String director;

    @Column(name = "year", nullable = false)
    @NotBlank(message = "The year cannot be empty")
    private String year;

    @ManyToOne  // Cambiando de @ManyToMany a @ManyToOne
    @JoinColumn(name = "genre_id")  // Clave foránea en la tabla de películas
    private Genre genre;

    @Column(name = "description", length = 500)
    @NotBlank(message = "The description cannot be empty")
    private String description;

    @Column(name = "imdb_rating")
    private double imdbRating;

    @Column(name = "poster_url")
    private String posterUrl;



}
