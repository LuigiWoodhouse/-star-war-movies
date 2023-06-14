package com.starwar.movie.impl;

import com.starwar.movie.DAO.DirectorsDAO;
import com.starwar.movie.model.Directors;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DirectorsDAOImpl implements DirectorsDAO {

    @Override
    public Directors save(Directors directors) {
        return null;
    }

    @Override
    public Directors findById(Integer movieId) {
        return null;
    }

    @Override
    public List<Directors> findAll() {
        return null;
    }

    @Override
    public void delete(Directors directors) {

    }
}
