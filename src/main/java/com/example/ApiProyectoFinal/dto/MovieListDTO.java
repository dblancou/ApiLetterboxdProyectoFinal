package com.example.ApiProyectoFinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieListDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long listId;
    private Long userId;
    private String name;
    private LocalDateTime createdAt;
    private List<FilmDTO> films; // Lista de películas en la lista
}
