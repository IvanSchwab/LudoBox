package com.ludoproject.LudoBox.Entities;

import com.ludoproject.LudoBox.Entities.GameList;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class User {

    public User(int id, GameList toPlayList, GameList playedGamesList, List<Review> reviews, Image profileImage) {
        this.id              = id;
        this.toPlayList      = toPlayList;
        this.playedGamesList = playedGamesList;
        this.reviews         = new ArrayList<Review>();
        this.profileImage    = profileImage;
    }

    @Getter
    private int id;

    private GameList toPlayList;
    private GameList playedGamesList;
    private List<Review> reviews;

    @Getter
    private Image profileImage;

    public void LogIn(){}
    public void LogOut(){}
    public void CreateReview(){}
    public void EditReview(int reviewID){}
    public void RemoveReview(int reviewID){}
    public void CreateList(){}
    public void RemoveList(int listID){}
    public void RateGame(int gameID){}

}

