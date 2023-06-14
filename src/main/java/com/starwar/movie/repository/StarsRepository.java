package com.starwar.movie.repository;

import com.starwar.movie.model.Stars;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StarsRepository extends JpaRepository<Stars, Long> {

    List<Stars> findByPersonId(Integer personId);
    List<Stars> findByMovieId(Integer movieId);
}

