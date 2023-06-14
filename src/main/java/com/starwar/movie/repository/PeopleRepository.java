package com.starwar.movie.repository;

import com.starwar.movie.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {

}
