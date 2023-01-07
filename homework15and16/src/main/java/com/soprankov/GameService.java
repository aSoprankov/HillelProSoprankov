package com.soprankov;

import java.io.IOException;

public interface GameService {

    void startTheGame() throws IOException;

    void createNewGame();

    void saveGame() throws IOException;

    void continueGame() throws IOException;

    void stopGame();

    void startRound() throws IOException;

    int userTurn() throws IOException;

    int compTurn();

    void determinateRoundWinner(int userShape, int compShape);

}
