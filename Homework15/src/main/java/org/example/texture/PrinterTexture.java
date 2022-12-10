package org.example.texture;

import java.util.Arrays;

import static java.lang.System.out;

public class PrinterTexture extends TextureDatabase {
    public void printWelcome() {
        out.println(welcomeTexture());
    }

    public void printChoiceMenu() {
        out.print(menuTexture());
    }

    public void printShape(int userShape, int compShape) {
        StringBuilder[] stringBuilders = new StringBuilder[12];
        String[] userShapeArray = shapeTexture(userShape).split("\\.");
        String[] compShapeArray = String.valueOf(
                        new StringBuilder(shapeTexture(compShape)).reverse())
                .split("\\.");

        Arrays.setAll(stringBuilders, i -> new StringBuilder());

        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder().append(userShapeArray[i]).append(compShapeArray[i]);
        }
        Arrays.stream(stringBuilders).forEach(out::println);
    }

    public void printWinner(int result) {
        StringBuilder[] stringBuilders = new StringBuilder[7];
        String[] roundResult = winnerTexture(result).split("\\.");

        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder().append(roundResult[i]);
        }
        Arrays.stream(stringBuilders).forEach(out::println);
    }

    public void printGameOver(int[] score) {
        out.println(gameOverTexture());

        StringBuilder[] sb = new StringBuilder[6];
        Arrays.setAll(sb, i -> new StringBuilder("░░░░░"));
        int counter = 0;

        do {
            for (int i = 0; i < sb.length; i++) {
                if (score[counter] > 9) {
                    int secondNumb = score[counter] % 10;
                    int firstNumb = (score[counter] - secondNumb) / 10;

                    sb[i].append(numbersTexture(firstNumb)[i])
                            .append(numbersTexture(secondNumb)[i]);
                } else {
                    sb[i].append(numbersTexture(0)[i])
                            .append(numbersTexture(score[counter])[i]);
                }
                sb[i].append("░░░░░░░");
            }
            counter++;
        } while (counter != 3);

        Arrays.stream(sb).forEach(out::println);
    }
}