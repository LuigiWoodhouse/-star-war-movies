package com.starwar.movie.controller;

import com.starwar.movie.dao.MoviesDAO;
import com.starwar.movie.model.Movies;
import com.starwar.movie.util.MovieData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    MoviesDAO moviesDAO;


    @GetMapping("/person/{personId}")
    @Secured({"ROLE_REGULAR","ROLE_ADMIN"})
    public ResponseEntity<List<Movies>> getMoviesByPersonId(@PathVariable int personId) {
        List<Movies> movies = moviesDAO.getMoviesByPersonId(personId);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/movie-data/{movieId}")
    @Secured({"ROLE_REGULAR","ROLE_ADMIN"})
    public ResponseEntity<MovieData> getMovieData(@PathVariable Integer movieId) {
        MovieData movieData = moviesDAO.getMovieData(movieId);
        return ResponseEntity.ok(movieData);
    }
    @GetMapping("/all")
    @Secured({"ROLE_REGULAR","ROLE_ADMIN"})
    public ResponseEntity<List<Movies>> getMovies(@RequestParam(defaultValue = "0") int page,
                                                  @RequestParam(defaultValue = "10") int size,
                                                  @RequestParam(defaultValue = "title") String sortBy,
                                                  @RequestParam(defaultValue = "asc") String sortOrder) {
        List<Movies> movies = moviesDAO.getMovies(page, size, sortBy, sortOrder);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{id}")
    @Secured({"ROLE_REGULAR","ROLE_ADMIN"})
    public ResponseEntity<Movies> getRatingsById(@PathVariable("id") Integer id) {
        Movies movies = moviesDAO.findById(id);
        if (movies != null) {
            return ResponseEntity.ok(movies);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/delete/{id}")
    @Secured("ROLE_ADMIN")
    public ResponseEntity<String> deleteMovies(@PathVariable("id") Integer id) {
        moviesDAO.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    @Secured("ROLE_ADMIN")
    public ResponseEntity<Movies> updateMovieById(@RequestBody Movies movies, @PathVariable("id") Integer id) {
        Movies updatedMovie = moviesDAO.updateById(movies, id);
        return ResponseEntity.ok(updatedMovie);
    }
    @PostMapping("/save/new")
    @Secured("ROLE_ADMIN")
    public ResponseEntity<Movies> saveRMovies(@RequestBody Movies movies) {
        Movies savedMovies = moviesDAO.save(movies);
        return ResponseEntity.ok(savedMovies);
    }
}