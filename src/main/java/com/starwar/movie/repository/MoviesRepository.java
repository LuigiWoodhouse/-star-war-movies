package com.starwar.movie.repository;

import com.starwar.movie.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, Integer> {
}
