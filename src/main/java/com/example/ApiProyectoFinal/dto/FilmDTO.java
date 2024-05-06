package com.example.ApiProyectoFinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long filmId;
    private String title;
    private String director;
    private String year;
    private String genreName;
    private String description;
    private double imdbRating;
    private String posterUrl;

}