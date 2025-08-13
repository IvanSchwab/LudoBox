package com.ludoproject.LudoBox.Entities;

import lombok.Getter;

public class Comment {
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
}
