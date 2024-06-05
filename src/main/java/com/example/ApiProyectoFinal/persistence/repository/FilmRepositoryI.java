package com.example.ApiProyectoFinal.persistence.repository;

import com.example.ApiProyectoFinal.persistence.model.Film;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepositoryI extends JpaRepository<Film, Long> {

    // Encuentra películas por el titulo
    List<Film> findByTitle(String title);

    // Encuentra películas por el nombre del director
    List<Film> findByDirector(String director);

    // Encuentra películas por el año de lanzamiento
    List<Film> findByYear(String year);

    // Busca películas que tengan una calificación IMDb superior a un cierto umbral
    List<Film> findByImdbRatingGreaterThan(double rating);

    // Método para buscar películas por género con límite
    List<Film> findByGenreName(String genreName, Pageable pageable);

    // Busca películas que contengan una palabra clave en el título
    List<Film> findByTitleContaining(String keyword);
    List<Film> findByTitleContainingIgnoreCase(String title);

    // Recupera una lista de películas ordenadas por su calificación IMDb de forma descendente
    List<Film> findAllByOrderByImdbRatingDesc();

    // Método para obtener las últimas películas ordenadas por filmId
    @Query("SELECT f FROM Film f ORDER BY f.filmId DESC")
    List<Film> findLatestFilms(Pageable pageable);

    // Método para obtener las mejores películas
    List<Film> findTop10ByOrderByImdbRatingDesc();




}
