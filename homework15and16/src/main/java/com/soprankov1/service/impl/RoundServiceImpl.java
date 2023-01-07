package com.soprankov1.service.impl;

import com.soprankov1.service.RoundService;
import com.soprankov1.exception.InputFormatException;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class RoundServiceImpl implements RoundService {
    private final Scanner SCANNER = new Scanner(System.in);

    public int startRound() {
        return determinateRoundWinner(playerTurn(), computerTurn());
    }

    public int playerTurn() {
        out.println("""
                1 - stone
                2 - scissors
                3 - paper
                """);
        String shape = SCANNER.next();

        switch (shape) {
            case "1" -> {
                out.println("u choice STONE");
            }
            case "2" -> {
                out.println("u choice SCISSORS");
            }
            case "3" -> {
                out.println("u choice PAPER");
            }
            default -> throw new InputFormatException();
        }
        return Integer.parseInt(shape) - 1;
    }

    public int computerTurn() {
        //tmp
        int tmp = new Random().nextInt(3);
        switch (tmp) {
            case 0 -> out.println("computer choice STONE");
            case 1 -> out.println("computer choice SCISSORS");
            case 2 -> out.println("computer choice PAPER");
        }
        return tmp;
        //tmp

        //return new Random().nextInt(3);
    }

    public int determinateRoundWinner(int playerShape, int computerShape) {
        int[][] roundResult = {{0, 1, -1}, {-1, 0, 1}, {1, -1, 0}};
        int result = 0;

        try {
            result = roundResult[playerShape][computerShape];
        } catch (IllegalArgumentException ex) {
            err.println(ex.getMessage());
            exit(0);
        }

        //tmp
        if (result == -1) {
            out.println("u lose");
        } else if (result == 0) {
            out.println("no winner");
        } else {
            out.println("u win");
        }
        //tmp

        return result;
    }
}
