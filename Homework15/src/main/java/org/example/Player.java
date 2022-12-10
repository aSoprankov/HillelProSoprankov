package org.example;

public class Player {
    private final String NAME;
    private final int[] SCORE = {0, 0, 0};

    Player(String name) {
        this.NAME = name;
    }

    public int[] getSCORE() {
        return SCORE;
    }

    public void updateScore(int result) {
        this.SCORE[0]++;
        if (result > 0)
            this.SCORE[1]++;
        if (result < 0)
            this.SCORE[2]++;
    }
}