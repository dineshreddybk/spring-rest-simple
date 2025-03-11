package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Movie;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MovieService {
	
	    private final List<Movie> movieList = new ArrayList<>();
 
	    public MovieService() {
	        // Adding some sample movies
	        movieList.add(new Movie("1", "Inception", 2010));
	        movieList.add(new Movie("2", "Interstellar", 2014));
	        movieList.add(new Movie("3", "Parasite", 2019));
	    }
 
	    // Get all movies
	    public Flux<Movie> getAllMovies() {
	        return Flux.fromIterable(movieList);
	    }
 
	    // Get movie by ID
	    public Mono<Movie> getMovieById(String id) {
	        return Mono.justOrEmpty(movieList.stream()
	                .filter(movie -> movie.getId().equals(id))
	                .findFirst());
	    }
}