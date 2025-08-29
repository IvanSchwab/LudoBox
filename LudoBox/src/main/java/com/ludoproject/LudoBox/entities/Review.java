package com.ludoproject.LudoBox.entities;

import com.ludoproject.LudoBox.interfaces.Ratable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.List;
import java.util.ArrayList;

public class Review implements Ratable {
    public Review(Long reviewID, Long userID, String reviewText, Long gameID) {
        this.reviewId = reviewID;
        this.userID = userID;
        this.reviewText = reviewText;
        this.gameID = gameID;
        this.commentsList = new ArrayList<ParentComment>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long reviewId;

    @Getter
    private final Long userID;

    @Getter
    private String reviewText;

    @Getter
    private final Long gameID;

    private List<ParentComment> commentsList;

    private Rating rating;

    public void editReviewText(String newReviewText) {
        this.reviewText = newReviewText;
    }

    @Override
    public void Rate(Rating rating) {

    }

    public void setUser(User user) {
    }

    public Review(Long reviewID, Long userID, Long gameID) {
        this.reviewId = reviewID;
        this.userID = userID;
        this.gameID = gameID;
    }


}
