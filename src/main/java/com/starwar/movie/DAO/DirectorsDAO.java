package com.starwar.movie.DAO;

import com.starwar.movie.model.Directors;
import java.util.List;
public interface DirectorsDAO {

    Directors save(Directors directors);

    Directors findById(Integer movieId);

    List<Directors> findAll();

    void delete(Directors directors);

}
