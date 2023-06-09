package com.starwar.movie.DAO;

import com.starwar.movie.model.Stars;
import java.util.List;
public interface StarsDAO {

    Stars save(Stars stars);

    Stars findById(Integer movieId);

    List<Stars> findAll();

    void delete(Stars stars);
}
