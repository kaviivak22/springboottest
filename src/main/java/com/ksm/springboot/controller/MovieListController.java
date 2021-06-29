package com.ksm.springboot.controller;

import com.ksm.springboot.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieListController {



    @RequestMapping(method= RequestMethod.GET, value="/all")
    public List<Movie>  getMovieList() {

        List<Movie> movieList = new ArrayList<>();
        Movie movie = new Movie();
        movie.setActor("Rajini");
        movie.setMovieName("Basha");
        movieList.add(movie);

        Movie movie1 = new Movie();
        movie1.setActor("Rajini");
        movie1.setMovieName("Annamalai");
        movieList.add(movie1);

        Movie movie2 = new Movie();
        movie2.setActor("Rajini");
        movie2.setMovieName("Thalapathi");
        movieList.add(movie2);


        return movieList;
    }
    }