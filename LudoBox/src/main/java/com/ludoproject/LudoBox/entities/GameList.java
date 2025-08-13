package com.ludoproject.LudoBox.Entities;

import lombok.Getter;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameList {

    public GameList(
            String gameListName,
            String description,
            Date creationDate,
            Boolean isPublic,
            Double score
    ) {
        this.gameListName = gameListName;
        this.description = description;
        this.creationDate = creationDate;
        this.isPublic = isPublic;
        this.score = score;
        this.gamesID = new ArrayList<Integer>();
    }

    @Getter
    private final String gameListName;

    private List<Integer> gamesID;

    @Getter
    private String description;

    @Getter
    private Image bannerImage;

    @Getter
    private final Date creationDate;

    @Getter
    private Boolean isPublic;

    @Getter
    private Double score;

    public void addGame(int gameID){
        this.gamesID.add(gameID);
    }
    private void removeGame(int gameID){
        this.gamesID.remove(gameID);
    }
    public void editList(){
    }
    public void ChangeVisibility(){
        this.isPublic = !this.isPublic;
    }
}
