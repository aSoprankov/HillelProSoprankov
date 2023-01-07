package com.soprankov;

import com.soprankov.texture.CustomTexture;
import com.soprankov.texture.Texture;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class GameServiceImpl extends Texture implements GameService {

    private final Scanner SCANNER = new Scanner(in);
    private final CustomTexture PRINT_TEXTURE = new CustomTexture();
    private final Player USER = new Player();
    private final String FILE_NAME = "Homework15/src/main/java/org/example/io/savedGame.txt";

    public void startTheGame() throws IOException {
        out.println(getMenuElement("welcome"));
        int choice = checkUserInput(SCANNER.next());

        switch (choice) {
            case 1 -> createNewGame();
            case 2 -> continueGame();
            default -> throw new IllegalStateException("You can only use [1] or [2]");
        }

        int counter = 0;

        do {
            startRound();
            counter++;
        } while (counter != USER.getNumberOfRounds());
        stopGame();
    }

    public void createNewGame() {
        out.println(getMenuElement("name"));
        USER.setName(SCANNER.next());

        out.println(getMenuElement("number of rounds"));
        int numberOfRounds = checkUserInput(SCANNER.next());
        USER.setNumberOfRounds(numberOfRounds);

        if (numberOfRounds == 0) stopGame();
        if (numberOfRounds < 0) throw new NumberFormatException();
    }

    public void saveGame() throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(FILE_NAME);

        fileOutputStream.write(USER.getPlayerDate().getBytes(StandardCharsets.UTF_8));

        fileOutputStream.close();
        exit(0);
    }

    public void continueGame() throws IOException {
        if (new File(FILE_NAME).length() != 0) {
            InputStream is = new FileInputStream(FILE_NAME);

            StringBuilder string = new StringBuilder();
            int size = is.available();

            for (int i = 0; i < size; i++) {
                string.append((char) is.read());
            }

            String[] sTest = string.toString().split("&");
            int[] score = new int[3];

            for (int i = 0; i < score.length; i++) {
                score[i] = Integer.parseInt(sTest[i + 2]);
            }

            USER.setName(sTest[0]);
            USER.setScore(score);
            USER.setNumberOfRounds(Integer.parseInt(sTest[1]) - USER.getScore()[0]);

            is.close();
        } else {
            out.println(getMenuElement("no saves"));
            int userChoice = checkUserInput(SCANNER.next());

            switch (userChoice) {
                case 1 -> startTheGame();
                case 2 -> exit(0);
                default -> throw new IllegalStateException("Unexpected value: " + userChoice);
            }
        }
    }

    public void stopGame() {
        PRINT_TEXTURE.printGameOver(USER.getScore());

        try {
            new FileOutputStream(FILE_NAME, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        exit(0);
    }

    public void startRound() throws IOException {
        out.println(getMenuElement("menu"));
        int userChoice = checkUserInput(SCANNER.next());

        switch (userChoice) {
            case 1 -> {
                out.println(getMenuElement("shape"));
                determinateRoundWinner(userTurn(), compTurn());
            }
            case 2 -> saveGame();
            case 3 -> exit(0);
            default -> throw new IllegalStateException("Unexpected value: " + userChoice);
        }
    }

    public int userTurn() {
        return checkUserInput(SCANNER.next()) - 1;
    }

    public int compTurn() {
        return new Random().nextInt(3);
    }

    public void determinateRoundWinner(int userShape, int compShape) {
        int[][] roundResult = {{0, 1, -1}, {-1, 0, 1}, {1, -1, 0}};
        int result = 0;

        try {
            result = roundResult[userShape][compShape];
        } catch (IllegalArgumentException ex) {
            err.println(ex.getMessage());
            exit(0);
        }

        PRINT_TEXTURE.printShape(userShape, compShape);
        PRINT_TEXTURE.printWinner(result);
        USER.updateScore(result);
    }

    private int checkUserInput(String string) {
        int tmpValue = 0;

        try {
            tmpValue = Integer.parseInt(string);
        } catch (NumberFormatException ex) {
            err.println(ex.getMessage() + " You can only use numbers");
            exit(0);
        }
        return tmpValue;
    }
}
