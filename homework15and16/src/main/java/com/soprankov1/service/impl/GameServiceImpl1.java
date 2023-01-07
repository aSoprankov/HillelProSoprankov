package com.soprankov1.service.impl;

import com.soprankov1.service.GameService1;
import com.soprankov1.exception.InputFormatException;
import com.soprankov1.exception.NumberOfRoundsException;
import com.soprankov1.player.Player1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class GameServiceImpl1 implements GameService1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final RoundServiceImpl ROUND_SERVICE = new RoundServiceImpl();
    private static Player1 player;

    public void startGame() {
        out.println("""
                1 - start new game
                2 - continue game
                3 - exit""");

        int menu = checkUserInput(SCANNER.next());

        switch (menu) {
            case 1 -> {
                out.println("create new game");
                createNewGame();
            }
            case 2 -> {
                out.println("continue game");
                continueGame();
            }
            case 3 -> {
                out.println("exit");
                stopGame();
            }
            default -> throw new InputFormatException();
        }
    }

    public void createNewGame() {
        out.print("Name: ");
        String name = SCANNER.next();

        out.print("Number of rounds: ");
        int numberOfRounds = checkUserInput(SCANNER.next());

        if (numberOfRounds < 0) {
            throw new NumberOfRoundsException(String.valueOf(numberOfRounds));
        }

        player = new Player1(name, numberOfRounds);
        out.println("Name: " + name + "\nRounds: " + numberOfRounds);

        while (numberOfRounds != 0) {
            player.updateScore(ROUND_SERVICE.startRound());
            numberOfRounds--;

            out.println("""
                    1 - play next round
                    2 - exit and save game
                    3 - exit
                    """);
            int choice = checkUserInput(SCANNER.next());

            switch (choice) {
                case 1 -> {
                    out.println("play next round");
                }
                case 2 -> {
                    out.println("exit and save");
                    try {
                        saveGame();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    exit(0);
                }
                case 3 -> {
                    exit(0);
                }
            }
        }
        stopGame();
    }

    public void saveGame() throws IOException {
        //Path path = Path.of(System.getProperty("user.dir"));
        Path path = Path.of(System.getProperty("HillelProSoprankov/homework15and16/src/main/java/com/soprankov1/player"));


        File file = new File(path.toString(), "/saved");
        file.mkdir();

        String string = player.getName().concat("#")
                .concat(String.valueOf(player.getNumberOfRounds())).concat("#")
                .concat(Arrays.toString(player.getScore()));

        if (!file.exists()) {
            file.createNewFile();
        }

        OutputStream outputStream = new FileOutputStream(file, false);
        outputStream.write(string.getBytes(StandardCharsets.UTF_8));
        outputStream.close();
    }

    public void continueGame() {

    }

    public void stopGame() {
        int[] score = player.getScore();
        out.println("game over" + Arrays.toString(score));
    }

    private int checkUserInput(String string) {
        int tmp = 0;

        try {
            tmp = Integer.parseInt(string);
        } catch (NumberFormatException ex) {
            err.println(ex.getMessage() + ". You can only use numbers.");
            exit(0);
        }
        return tmp;
    }
}
