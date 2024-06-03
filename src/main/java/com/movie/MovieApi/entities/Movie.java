package com.movie.MovieApi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer movieId;

    @Column(nullable = false,length = 200)
    @NotBlank(message = "please fill it")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "please fill it")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "please fill it")
    private String studio;

    @ElementCollection
    @CollectionTable(name="moviesCast")
    private Set<String> movieCast;

    @Column(nullable = false)
    @NotBlank(message = "please fill it")
    private String poster;

    @Column(nullable = false)
    @NotBlank(message = "please fill it")
    private String releaseYear;

}
