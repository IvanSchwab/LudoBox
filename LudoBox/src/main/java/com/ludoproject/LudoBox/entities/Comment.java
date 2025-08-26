package com.ludoproject.LudoBox.Entities;

import com.ludoproject.LudoBox.Interfaces.Hiddable;
import lombok.Getter;

public class Comment implements Hiddable {
    public Comment(int commentID, int userID, String text) {
        this.commentID = commentID;
        this.userID = userID;
        this.text = text;
    }
    @Getter
    private final int commentID;
    @Getter
    private final int userID;
    @Getter
    private String text;

    @Override
    public void hide() {

    }
}
