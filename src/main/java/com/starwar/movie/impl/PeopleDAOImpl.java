package com.starwar.movie.impl;

import com.starwar.movie.DAO.MoviesDAO;
import com.starwar.movie.DAO.PeopleDAO;
import com.starwar.movie.model.People;
import com.starwar.movie.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
public class PeopleDAOImpl implements PeopleDAO {

    @Autowired
    PeopleRepository peopleRepository;

    @Autowired
    MoviesDAO moviesDAO;

    @Override
    public List<People> getPeople(int page, int size, String sortBy, String sortOrder) {
        Pageable pageable = moviesDAO.createPageable(page, size, sortBy, sortOrder);
        Page<People> personPage = peopleRepository.findAll(pageable);
        return personPage.getContent();
    }

}
