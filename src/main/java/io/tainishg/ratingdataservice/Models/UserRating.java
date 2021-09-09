package io.tainishg.ratingdataservice.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserRating {

    public UserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    private List<Rating> userRating;

}
