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
@Table (name = "Stars")
public class Stars {

    @Column(name = "movie_id")
    private Integer movie_id;

    @Column(name = "person_id")
    private Integer person_id;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    @NotNull
    private Movies movie;

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    @NotNull
    private People people;
}
