package io.tainishg.ratingdataservice.resources;

import io.tainishg.ratingdataservice.Models.Rating;
import io.tainishg.ratingdataservice.Models.UserRating;
import io.tainishg.ratingdataservice.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingResource {

    @Autowired
    private RatingService ratingService;

    @RequestMapping("/{movieId}")
    public Rating getRatingByMovieId(@PathVariable("movieId") String movieId){
    return  ratingService.getRatingByMovieId(movieId);
    }

    @RequestMapping("users/{userId}")
    public UserRating getMoviesWatchedByUser(@PathVariable("userId") String userId){
        return ratingService.getRatingsGivenByUser(userId);
    }

}
