package com.soprankov1.service;

public interface RoundService {

    int startRound();

    int playerTurn();

    int computerTurn();

    int determinateRoundWinner(int playerShape, int computerShape);
}
