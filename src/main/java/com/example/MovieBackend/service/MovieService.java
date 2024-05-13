package com.example.MovieBackend.service;

import com.example.MovieBackend.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();

    Movie getMovieById(Long id);

    void DeleteMovie(Long id);
}
