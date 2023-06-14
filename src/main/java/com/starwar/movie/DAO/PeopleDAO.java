package com.starwar.movie.DAO;

import com.starwar.movie.model.People;
import java.util.List;
public interface PeopleDAO {

    List<People> getPeople(int page, int size, String sortBy, String sortOrder);
}
