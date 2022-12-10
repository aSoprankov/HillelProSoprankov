package org.example;

import org.example.texture.PrinterTexture;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class GameServiceImpl implements GameService {
    private final Scanner SCANNER = new Scanner(in);
    private final PrinterTexture RESOURCE = new PrinterTexture();
    private Player user;

    public void startGame() {
        out.print("Input ur name: ");
        user = new Player(SCANNER.next());
        out.print("Input number of rounds: ");
        String string = SCANNER.next();
        int numberOfRounds = 0;

        try {
            numberOfRounds = Integer.parseInt(string);
        } catch (NumberFormatException ex) {
            System.err.println(ex.getMessage() + "\nNumber of rounds can be only numbers");
            System.exit(0);
        }

        if (numberOfRounds < 1)
            stopGame();

        if (numberOfRounds > 99) {
            out.println("Number of rounds cant be > 100");
            startGame();
        }

        RESOURCE.printWelcome();

        do {
            startRound();
            numberOfRounds--;
        } while (numberOfRounds != 0);
        stopGame();
    }

    public void startRound() {
        determinateRoundWinner(userTurn(), compTurn());
    }

    public int userTurn() {
        RESOURCE.printChoiceMenu();
        String string = SCANNER.next();
        int userTurn = 0;

        try {
            userTurn = Integer.parseInt(string);
        } catch (NumberFormatException ex) {
            System.err.println(ex.getMessage() + "\nInput can be 1, 2, 3 or 0");
            System.exit(0);
        }

        if (userTurn == 0)
            stopGame();

        return userTurn - 1;
    }

    public int compTurn() {
        return new Random().nextInt(3);
    }

    public void determinateRoundWinner(int userShape, int compShape) {
        int[][] roundResult = {{0, 1, -1}, {-1, 0, 1}, {1, -1, 0}};
        int result = 0;

        try {
            result = roundResult[userShape][compShape];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println(ex.getMessage() + "\nInput can be 1, 2, 3 or 0");
            System.exit(0);
        }

        RESOURCE.printShape(userShape, compShape);
        RESOURCE.printWinner(result);
        user.updateScore(result);
    }

    public void stopGame() {
        RESOURCE.printGameOver(user.getSCORE());
        exit(0);
    }
}