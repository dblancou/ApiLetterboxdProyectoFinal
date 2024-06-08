package com.example.ApiProyectoFinal.controller;

import com.example.ApiProyectoFinal.dto.MovieListDTO;
import com.example.ApiProyectoFinal.dto.UserDTO;
import com.example.ApiProyectoFinal.service.MovieListServiceI;
import com.example.ApiProyectoFinal.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movieLists")
public class MovieListController {

    @Autowired
    private MovieListServiceI movieListService;
    @Autowired
    private UserServiceI userService;

    @PostMapping
    public ResponseEntity<MovieListDTO> createMovieList(@RequestBody MovieListDTO movieListDTO) {
        if (movieListDTO.getUserId() == null && movieListDTO.getUserName() != null) {
            UserDTO user = userService.findUserByUsernameDTO(movieListDTO.getUserName());
            if (user != null) {
                System.out.println("User found: " + user.getUsername() + " with ID: " + user.getUserId());
                movieListDTO.setUserId(user.getUserId());
            } else {
                System.out.println("User not found with username: " + movieListDTO.getUserName());
                throw new IllegalArgumentException("User not found with username: " + movieListDTO.getUserName());
            }
        } else {
            System.out.println("UserId provided: " + movieListDTO.getUserId());
        }

        MovieListDTO createdList = movieListService.createMovieList(movieListDTO);
        return ResponseEntity.ok(createdList);
    }

    @PutMapping
    public ResponseEntity<MovieListDTO> updateMovieList(@RequestBody MovieListDTO movieListDTO) {
        return ResponseEntity.ok(movieListService.updateMovieList(movieListDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovieList(@PathVariable Long id) {
        movieListService.deleteMovieList(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieListDTO> getMovieListById(@PathVariable Long id) {
        return ResponseEntity.ok(movieListService.getMovieListById(id));
    }

    @GetMapping
    public ResponseEntity<List<MovieListDTO>> getAllMovieLists() {
        return ResponseEntity.ok(movieListService.getAllMovieLists());
    }

    @GetMapping("/byUserId/{userId}")
    public ResponseEntity<List<MovieListDTO>> getMovieListsByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(movieListService.getMovieListsByUser(userId));
    }

    @GetMapping("/byUsername/{username}")
    public ResponseEntity<List<MovieListDTO>> getMovieListsByUsername(@PathVariable String username) {
        return ResponseEntity.ok(movieListService.getMovieListsByUsername(username));
    }

    @PostMapping("/byUsername/{username}")
    public ResponseEntity<MovieListDTO> createMovieListByUsername(@PathVariable String username, @RequestBody MovieListDTO movieListDTO) {
        UserDTO user = userService.findUserByUsernameDTO(username);
        if (user != null) {
            System.out.println("User found: " + user.getUsername() + " with ID: " + user.getUserId());
            movieListDTO.setUserId(user.getUserId());
        } else {
            System.out.println("User not found with username: " + username);
        }
        MovieListDTO createdList = movieListService.createMovieList(movieListDTO);
        return ResponseEntity.ok(createdList);
    }

    @PostMapping("/{listId}/addFilm/{filmId}")
    public ResponseEntity<MovieListDTO> addFilmToList(@PathVariable Long listId, @PathVariable Long filmId) {
        MovieListDTO updatedList = movieListService.addFilmToList(listId, filmId);
        return ResponseEntity.ok(updatedList);
    }

    @DeleteMapping("/{listId}/removeFilm/{filmId}")
    public ResponseEntity<MovieListDTO> removeFilmFromList(@PathVariable Long listId, @PathVariable Long filmId) {
        System.out.println("Remove film from list called. List ID: " + listId + ", Film ID: " + filmId);
        MovieListDTO updatedList = movieListService.removeFilmFromList(listId, filmId);
        return ResponseEntity.ok(updatedList);
    }




}
