package com.starwar.movie.DAO;

import com.starwar.movie.model.Ratings;
import java.util.List;
public interface RatingsDAO {

    Ratings save(Ratings ratings);

    Ratings findById(Integer movieId);

    List<Ratings> findAll();

    void delete(Ratings ratings);
}
