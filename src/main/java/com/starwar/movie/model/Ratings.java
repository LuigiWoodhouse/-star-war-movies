package com.starwar.movie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
@Entity
@Table(name = "Ratings")
public class Ratings {

    @Id
    @Column(name = "movie_id")
    @NotNull
    private Integer movieId;

    @Column(name = "rating")
    @NotNull
    private float rating;

    @Column(name = "votes")
    @NotNull
    private Integer votes;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id", insertable = false, updatable = false)
    @NotNull
    private Movies movie;
}
