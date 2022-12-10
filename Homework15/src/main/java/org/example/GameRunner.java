package org.example;

public class GameRunner {
    public static void main(String[] args) {
        GameServiceImpl gsi = new GameServiceImpl();
        gsi.startGame();
    }
}