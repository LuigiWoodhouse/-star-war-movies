package com.starwar.movie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    @NotNull
    private String title;

    @Column(name = "year")
    private int year;

    public Movies(Movies movie, List<Directors> directors, List<Stars> stars, List<Ratings> ratings) {
    }
}
