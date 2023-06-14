package com.starwar.movie.repository;

import com.starwar.movie.model.Directors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DirectorRepository extends JpaRepository<Directors, Integer> {

    List<Directors> findByPersonId(Integer personId);
    List<Directors> findByMovieId(Integer movieId);
}
