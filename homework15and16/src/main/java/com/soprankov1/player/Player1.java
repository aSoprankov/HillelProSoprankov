package com.soprankov1.player;

public class Player1 {
    String name;
    int numberOfRounds;

    int[] score = {0, 0, 0}; //G-W-L

    public Player1(String name, int numberOfRounds) {
        this.name = name;
        this.numberOfRounds = numberOfRounds;
    }

    public void updateScore(int roundResult) {
        score[0]++;
        switch (roundResult) {
            case -1 -> score[2]++;
            case 1 -> score[1]++;
        }
    }

    public int[] getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }
}
