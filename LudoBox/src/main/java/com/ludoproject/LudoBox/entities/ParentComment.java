package com.ludoproject.LudoBox.Entities;
import lombok.Getter;

import java.util.List;
import java.util.ArrayList;

public class ParentComment extends Comment {
    public ParentComment(int commentID, int userID, String text) {
        super(commentID, userID, text);
        this.childrenComments = new ArrayList<Comment>();
    }
    @Getter
    private List<Comment> childrenComments;
}
