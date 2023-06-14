package com.starwar.movie.util;

import com.starwar.movie.model.Directors;
import com.starwar.movie.model.Movies;
import com.starwar.movie.model.Ratings;
import com.starwar.movie.model.Stars;
import lombok.Data;
import java.util.List;

@Data
public class MovieData {
    private final Movies movie;
    private final List<Directors> directors;
    private final List<Stars> stars;
    private final List<Ratings> ratings;

    public MovieData(Movies movie, List<Directors> directors, List<Stars> stars, List<Ratings> ratings) {
        this.movie = movie;
        this.directors = directors;
        this.stars = stars;
        this.ratings = ratings;
    }
}
