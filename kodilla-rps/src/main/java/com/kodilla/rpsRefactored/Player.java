package com.kodilla.rpsRefactored;

public class Player {
    private String name;
    private int score;

    public Player(){
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int score() {
        return score++;
    }
}