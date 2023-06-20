package com.starwar.movie.controller;

import com.starwar.movie.dao.PeopleDAO;
import com.starwar.movie.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {


    @Autowired
    PeopleDAO peopleDAO;

    @GetMapping("/all")
    @Secured({"ROLE_REGULAR","ROLE_ADMIN"})
    public ResponseEntity<List<People>> getPeople(@RequestParam(defaultValue = "0") int page,
                                                  @RequestParam(defaultValue = "10") int size,
                                                  @RequestParam(defaultValue = "name") String sortBy,
                                                  @RequestParam(defaultValue = "asc") String sortOrder) {
        List<People> people = peopleDAO.getPeople(page, size, sortBy, sortOrder);
        return ResponseEntity.ok(people);
    }
}
