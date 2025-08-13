package com.ludoproject.LudoBox.Entities;

import lombok.Getter;
import java.util.List;
import java.util.ArrayList;

public class Review {
    public Review(int reviewID, int userID, String reviewText, int gameID) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.reviewText = reviewText;
        this.gameID = gameID;
        this.commentsList = new ArrayList<ParentComment>();
    }

    @Getter
    private final int reviewID;

    @Getter
    private final int userID;

    @Getter
    private String reviewText;

    @Getter
    private final int gameID;

    private List<ParentComment> commentsList;

    private Rating rating;

    public void editReviewText(String newReviewText) {
        this.reviewText = newReviewText;
    }

}
