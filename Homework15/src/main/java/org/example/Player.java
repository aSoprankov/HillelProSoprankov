package org.example;

import static java.lang.System.*;

public class Player {
    private String name;
    private int numberOfRounds;
    private final int[] score = new int[3];

    public Player() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRound) {
        this.numberOfRounds = numberOfRound;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        arraycopy(score, 0, this.score, 0, this.score.length);
    }

    public String getPlayerDate() {
        return name.concat("&")
                .concat(String.valueOf(numberOfRounds)).concat("&")
                .concat(String.valueOf(score[0])).concat("&")
                .concat(String.valueOf(score[1])).concat("&")
                .concat(String.valueOf(score[2])).concat("&");
    }

    public void updateScore(int result) {
        this.score[0]++;

        if (result > 0)
            this.score[1]++;
        if (result < 0)
            this.score[2]++;
    }
}