package com.starwar.movie.impl;

import com.starwar.movie.DAO.StarsDAO;
import com.starwar.movie.model.Stars;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StarsDAOImpl implements StarsDAO {

    @Override
    public Stars save(Stars stars) {
        return null;
    }

    @Override
    public Stars findById(Integer movieId) {
        return null;
    }

    @Override
    public List<Stars> findAll() {
        return null;
    }

    @Override
    public void delete(Stars stars) {

    }
}
