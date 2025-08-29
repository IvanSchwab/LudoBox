package com.ludoproject.LudoBox.entities;

import com.ludoproject.LudoBox.interfaces.Collaborative;

import java.util.List;

public class CustomGameList extends GameList implements Collaborative{
    public CustomGameList(String gameListName, String description, Boolean isPublic) {
        super(gameListName, description, isPublic);
    }

    private List<Integer> collaboratorsList;

    private static final int MAX_COLLABORATORS = 10;

    //public List<User> getCollaboratorsList() {}

    private int likesAmount;

    private boolean isEditableByAll;

    @Override
    public void AddCollaborator(int userID) {
        if (collaboratorsList.size() < MAX_COLLABORATORS) {
            collaboratorsList.add(userID);
        }
        else{
            // TODO: mensaje de exceso de colaboradores.
        }
    }

    @Override
    public void RemoveCollaborator(int userID) {

    }

    @Override
    public void hide() {

    }
}
