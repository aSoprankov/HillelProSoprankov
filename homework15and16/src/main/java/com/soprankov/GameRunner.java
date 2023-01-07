package com.soprankov;

import java.io.IOException;


public class GameRunner {
    public static void main(String[] args) throws IOException {
        GameServiceImpl gsi = new GameServiceImpl();
        gsi.startTheGame();
    }
}