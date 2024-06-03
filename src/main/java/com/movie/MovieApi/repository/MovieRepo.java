package com.movie.MovieApi.repository;

import com.movie.MovieApi.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer> {


}
