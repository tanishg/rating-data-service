package io.tainishg.ratingdataservice.Services;

import io.tainishg.ratingdataservice.Models.Rating;
import io.tainishg.ratingdataservice.Models.UserRating;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RatingService {

    private List<Rating> ratings = new ArrayList<>(Arrays.asList(
            new Rating("1111", 4),
            new Rating("2222", 5)
    ));

    public Rating getRatingByMovieId(String movieId) {
        return ratings.stream().filter(rat -> movieId.equals(rat.getMovieId())).findFirst().orElse(null);
    }

    public UserRating getRatingsGivenByUser(String userId) {
        List<Rating> ratingsUser = new ArrayList<>(ratings);
        ratingsUser.add(new Rating("3333", 5));
        UserRating userRating = new UserRating();
        UserRating userRating2 = new UserRating(new ArrayList<>());
        userRating.setUserRating(ratingsUser);
        return userRating;
    }
}
