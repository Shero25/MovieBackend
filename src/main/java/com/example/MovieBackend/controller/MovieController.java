package com.example.MovieBackend.controller;

import com.example.MovieBackend.entity.Movie;
import com.example.MovieBackend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/movie")

public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie>getAllMovies(){
        return movieService.getAllMovies();
    }

    @DeleteMapping("/{id}")
    public void DeleteMovie(@PathVariable Long id){
        this.movieService.DeleteMovie(id);
    }
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id){
        return movieService.getMovieById(id);
    }


}
