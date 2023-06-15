package com.starwar.movie.dao;

import com.starwar.movie.model.Movies;
import com.starwar.movie.util.MovieData;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface MoviesDAO {

    List<Movies> getMoviesByPersonId(Integer personId);

    MovieData getMovieData(Integer movieId);

    List<Movies> getMovies(int page, int size, String sortBy, String sortOrder);

    Pageable createPageable(int page, int size, String sortBy, String sortOrder);
}
