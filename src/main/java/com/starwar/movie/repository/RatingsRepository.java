package com.starwar.movie.repository;

import com.starwar.movie.model.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingsRepository extends JpaRepository<Ratings, Integer> {

    List<Ratings> findByMovieId(Integer movieId);
}
