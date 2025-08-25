package com.ludoproject.LudoBox.Entities;

import java.util.List;

public class PlayedGameList extends GameList {
    public PlayedGameList(String gameListName, String description, Boolean isPublic) {
        super(gameListName, description, isPublic);
    }

    private List<Review> playedGames;

}
