package com.example.MovieBackend.service;

import com.example.MovieBackend.entity.Movie;
import com.example.MovieBackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long id) {
        Optional<Movie> Optional=movieRepository.findById(id);
        Movie movie;

        if(Optional.isPresent()){
            movie=Optional.get();
        }else {
            throw new RuntimeException("Id not found");
        }
        return movie;
    }

    @Override
    public void DeleteMovie(Long id) {
    this.movieRepository.deleteById(id);
    }
}
