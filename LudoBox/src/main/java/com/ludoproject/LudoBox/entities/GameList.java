package com.ludoproject.LudoBox.Entities;

import lombok.Getter;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class GameList {

    public GameList(
            String gameListName,
            String description,
            Boolean isPublic,
    ) {
        // TODO: implementar peticion de ID valido.
        //this.gameListID =  ;
        this.gameListName = gameListName;
        this.description = description;
        // TODO: implementar asignar fecha actual.
        //this.creationDate = ;
        this.isPublic = isPublic;
        this.gamesID = new ArrayList<Integer>();
    }
    @Getter
    private final int gameListID;

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
