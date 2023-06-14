package com.starwar.movie.controller;

import com.starwar.movie.DAO.MoviesDAO;
import com.starwar.movie.model.Movies;
import com.starwar.movie.util.MovieData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    MoviesDAO moviesDAO;


    @GetMapping("/{personId}")
    public ResponseEntity<List<Movies>> getMoviesByPersonId(@PathVariable int personId) {
        List<Movies> movies = moviesDAO.getMoviesByPersonId(personId);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{movieId}")
    public ResponseEntity<MovieData> getMovieData(@PathVariable Integer movieId) {
        MovieData movieData = moviesDAO.getMovieData(movieId);
        return ResponseEntity.ok(movieData);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Movies>> getMovies(@RequestParam(defaultValue = "0") int page,
                                                  @RequestParam(defaultValue = "10") int size,
                                                  @RequestParam(defaultValue = "title") String sortBy,
                                                  @RequestParam(defaultValue = "asc") String sortOrder) {
        List<Movies> movies = moviesDAO.getMovies(page, size, sortBy, sortOrder);
        return ResponseEntity.ok(movies);
    }
}