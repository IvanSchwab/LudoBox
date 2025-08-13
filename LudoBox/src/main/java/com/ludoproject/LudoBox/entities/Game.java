package com.ludoproject.LudoBox.Entities;

import com.ludoproject.LudoBox.enums.Genre;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Game {

    //------------- Constructor -------------

    public Game(
            int id,
            String name,
            LocalDate release,
            double averagePlayTime,
            String description,
            Genre genre
    ) {
        this.id = id;
        this.name = name;
        this.release = release;
        this.averagePlayTime = averagePlayTime;
        this.description = description;
        this.genre = genre;
    }

    //------------- Atributos y Metodos -------------

    @Getter
    private final int id;

    @Getter
    private final String name;

    @Getter
    private final LocalDate release;

    @Getter
    private final double averagePlayTime;

    @Getter
    private final String description;

    @Getter
    private final Genre genre;

    @Getter
    private double rating;

    @Setter
    private Review review;
    //Todo: modificar relacion review-user-game

    //------------- ToString -------------

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", release=" + release +
                ", description='" + description + '\'' +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }

}
