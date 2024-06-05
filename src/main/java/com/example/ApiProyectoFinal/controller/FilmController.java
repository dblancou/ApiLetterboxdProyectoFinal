package com.example.ApiProyectoFinal.controller;

import com.example.ApiProyectoFinal.dto.FilmDTO;
import com.example.ApiProyectoFinal.service.FilmServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/films")
public class FilmController {

    @Autowired
    private FilmServiceI filmService;

    @PostMapping
    public ResponseEntity<FilmDTO> createFilm(@RequestBody FilmDTO filmDTO) {
        return ResponseEntity.ok(filmService.createFilm(filmDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FilmDTO> getFilmById(@PathVariable Long id) {
        return ResponseEntity.ok(filmService.getFilmById(id));
    }

    @GetMapping
    public ResponseEntity<List<FilmDTO>> getAllFilms() {
        return ResponseEntity.ok(filmService.getAllFilms());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FilmDTO> updateFilm(@PathVariable Long id, @RequestBody FilmDTO filmDTO) {
        filmDTO.setFilmId(id);
        return ResponseEntity.ok(filmService.updateFilm(filmDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFilm(@PathVariable Long id) {
        filmService.deleteFilm(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/latest")
    public List<FilmDTO> getLatestFilms(@RequestParam(defaultValue = "6") int limit, @RequestParam(defaultValue = "desc") String sortOrder) {
        return filmService.getLatestFilms(limit, sortOrder);
    }

    @GetMapping("/topRated")
    public List<FilmDTO> getTopRatedFilms(@RequestParam(defaultValue = "10") int limit) {
        return filmService.getTopRatedFilms(limit);
    }

    @GetMapping("/genre")
    public List<FilmDTO> getFilmsByGenre(@RequestParam String genreName, @RequestParam(defaultValue = "8") int limit) {
        return filmService.findByGenre(genreName, limit);
    }

    @GetMapping("/search")
    public List<FilmDTO> searchFilmsByTitle(@RequestParam String title) {
        return filmService.searchFilmsByTitle(title);
    }
}
