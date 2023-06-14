package com.starwar.movie.impl;

import com.starwar.movie.DAO.RatingsDAO;
import com.starwar.movie.model.Ratings;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RatingsDAOImpl implements RatingsDAO {

    @Override
    public Ratings save(Ratings ratings) {
        return null;
    }

    @Override
    public Ratings findById(Integer movieId) {
        return null;
    }

    @Override
    public List<Ratings> findAll() {
        return null;
    }

    @Override
    public void delete(Ratings ratings) {

    }
}
