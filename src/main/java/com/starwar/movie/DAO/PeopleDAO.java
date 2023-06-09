package com.starwar.movie.DAO;

import com.starwar.movie.model.People;
import java.util.List;
public interface PeopleDAO {

    People save(People people);

    People findById(Integer id);

    List<People> findAll();

    void delete(People people);
}
