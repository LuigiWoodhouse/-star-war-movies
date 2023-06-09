package com.starwar.movie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
@Entity
@Table(name = "Ratings")
public class Ratings {

    @Column(name = "movie_id")
    @NotNull
    private Integer movie_id;

    @Column(name = "person_id")
    @NotNull
    private float rating;

    @Column(name = "votes")
    @NotNull
    private Integer votes;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    @NotNull
    private Movies movie;
}
