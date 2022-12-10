package org.example;

public interface GameService {

    public void startGame();

    public void startRound();

    public int userTurn();

    public int compTurn();

    public void determinateRoundWinner(int userShape, int compShape);

    public void stopGame();

}
