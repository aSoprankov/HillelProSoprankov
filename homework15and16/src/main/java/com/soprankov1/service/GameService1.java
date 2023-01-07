package com.soprankov1.service;

import java.io.IOException;

public interface GameService1 {
    void startGame();

    void createNewGame();

    void saveGame() throws IOException;

    void continueGame();

    void stopGame();
}
