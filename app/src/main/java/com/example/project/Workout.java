package com.example.project;

public class Workout {
    private String title;
    private String wod;

    // Constructor
    public Workout(String title, String wod) {
        this.title = title;
        this.wod = wod;
    }

    public Workout()
    {

    }

    //Title: getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //wod: getter and setter
    public String getWod() {
        return wod;
    }

    public void setWod(String wod) {
        this.wod = wod;
    }
}
