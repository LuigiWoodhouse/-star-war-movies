package com.starwar.movie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
@Data
@Entity
@Table(name = "Directors")
public class Directors {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    @NotNull
    private Integer movieId;

    @Column(name = "person_id")
    @NotNull
    private Integer personId;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id", insertable = false, updatable = false)
    @NotNull
    private Movies movie;

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id" ,insertable = false, updatable = false)
    @NotNull
    private People people;
}
