package com.ludoproject.LudoBox.Entities;

public class Rating {
    public Rating(
            int generalRating,
            int gameplayRating,
            int storyRating,
            int visualsRating,
            int soundRating,
            int creativityRating,
            int replayabilityRating
    ){
        this.generalRating       = generalRating;
        this.gameplayRating      = gameplayRating;
        this.storyRating         = storyRating;
        this.visualsRating       = visualsRating;
        this.soundRating         = soundRating;
        this.creativityRating    = creativityRating;
        this.replayabilityRating = replayabilityRating;
    }

    private int generalRating;
    private int gameplayRating;
    private int storyRating;
    private int visualsRating;
    private int soundRating;
    private int creativityRating;
    private int replayabilityRating;


    public int getAverage(){
        return 0;
    }
}
