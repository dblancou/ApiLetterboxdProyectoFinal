package com.example.ApiProyectoFinal.controller;

import com.example.ApiProyectoFinal.dto.MovieListDTO;
import com.example.ApiProyectoFinal.service.MovieListServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movieLists")
public class MovieListController {

    @Autowired
    private MovieListServiceI movieListService;

    @PostMapping
    public ResponseEntity<MovieListDTO> createMovieList(@RequestBody MovieListDTO movieListDTO) {
        return ResponseEntity.ok(movieListService.createMovieList(movieListDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieListDTO> getMovieListById(@PathVariable Long id) {
        return ResponseEntity.ok(movieListService.getMovieListById(id));
    }

    @GetMapping
    public ResponseEntity<List<MovieListDTO>> getAllMovieLists() {
        return ResponseEntity.ok(movieListService.getAllMovieLists());
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieListDTO> updateMovieList(@PathVariable Long id, @RequestBody MovieListDTO movieListDTO) {
        movieListDTO.setListId(id);  // Asegurarse de que el ID de la lista está configurado correctamente
        return ResponseEntity.ok(movieListService.updateMovieList(movieListDTO));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovieList(@PathVariable Long id) {
        movieListService.deleteMovieList(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<MovieListDTO>> getMovieListsByUser(@PathVariable Long userId) {
        List<MovieListDTO> movieLists = movieListService.getMovieListsByUser(userId);
        return ResponseEntity.ok(movieLists);
    }
}
