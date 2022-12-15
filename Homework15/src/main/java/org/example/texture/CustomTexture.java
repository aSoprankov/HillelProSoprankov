package org.example.texture;

import java.util.Arrays;

import static java.lang.System.out;

public class CustomTexture extends Texture {
    public void printShape(int userShape, int compShape) {
        StringBuilder[] stringBuilders = new StringBuilder[12];
        String[] userShapeArray = getShapeTexture(userShape).split("\\.");
        String[] compShapeArray = String.valueOf(
                        new StringBuilder(getShapeTexture(compShape)).reverse())
                .split("\\.");

        Arrays.setAll(stringBuilders, i -> new StringBuilder());

        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder().append(userShapeArray[i]).append(compShapeArray[i]);
        }
        Arrays.stream(stringBuilders).forEach(out::println);
    }

    public void printWinner(int result) {
        switch (result) {
            case -1 -> out.println(getMenuElement("loser"));
            case 0 -> out.println(getMenuElement("no winners"));
            case 1 -> out.println(getMenuElement("winner"));
            default -> throw new IllegalStateException("Unexpected value: " + result);
        }
    }

    public void printGameOver(int[] score) {
        StringBuilder stringGameOver = new StringBuilder(getMenuElement("game over"));
        String[] arrayGameOver = stringGameOver.toString().split("\n");
        String[] arrayScore = arrayGameOver[3].split("00");

        StringBuilder customString = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int secondNumber, firstNumber = 0;

            if (score[i] > 9) {
                secondNumber = score[i] % 10;
                firstNumber = (score[i] - secondNumber) / 10;
            } else {
                secondNumber = score[i];
            }
            customString.append(arrayScore[i]).append(firstNumber).append(secondNumber);
        }

        arrayGameOver[3] = String.valueOf(customString.append(arrayScore[3]));

        stringGameOver = new StringBuilder();

        for (String s : arrayGameOver) {
            stringGameOver.append(s).append("\n");
        }
        out.println(stringGameOver);
    }
}