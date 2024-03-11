package com.winfred.sportsapp;

public class Sports {

    private String sportName;
    private int sportImage;

    public Sports(String sportName, int sportImage) {
        this.sportName = sportName;
        this.sportImage = sportImage;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public int getSportImage() {
        return sportImage;
    }

    public void setSportImage(int sportImage) {
        this.sportImage = sportImage;
    }
}
