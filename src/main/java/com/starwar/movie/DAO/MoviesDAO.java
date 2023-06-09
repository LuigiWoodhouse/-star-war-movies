package com.starwar.movie.DAO;

import com.starwar.movie.model.Movies;
import java.util.List;
public interface MoviesDAO {

    Movies save(Movies movie);

    Movies findById(Integer id);

    List<Movies> findAll();

    void delete(Movies movie);
}
