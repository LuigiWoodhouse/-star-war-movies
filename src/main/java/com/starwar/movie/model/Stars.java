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
@Table (name = "Stars")
public class Stars {

    @Id
    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "person_id")
    private Integer personId;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id", insertable = false, updatable = false)
    @NotNull
    private Movies movie;

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id", insertable = false, updatable = false)
    @NotNull
    private People people;
}
