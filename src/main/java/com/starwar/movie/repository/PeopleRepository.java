package com.starwar.movie.repository;

import com.starwar.movie.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PeopleRepository extends JpaRepository<People, Long> {

}
