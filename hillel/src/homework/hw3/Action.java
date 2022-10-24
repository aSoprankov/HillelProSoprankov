package homework.hw3;

import homework.hw3.task.*;

import java.util.Random;
import java.util.Scanner;

public abstract class Action {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        action();
    }

    public static void action() {
        System.out.print("""
                Menu Homework #3\s
                [1] - display odd numbers\s
                [2] - calculate factorial\s
                [3] - complete task1 and task2 using while\s
                [4] - complete task1 and task2 using do-while\s
                [5] - exponentiation\s
                [6] - output sequence of number\s
                [7] - print multiplication table\s
                [8] - output an array of values\s
                [9] - finding smallest number\s
                [10] - finding largest number\s
                [11] - swap elements\s
                [12] - find arithmetic mean of all elements\s
                [13] - print chess board\s
                [E] - Exit\s
                Input your choice:\040""");
        String choice = SCANNER.next().toUpperCase();

        switch (choice) {
            case "1" -> {
                DisplayOddNumbers.displayOddNumbers();
                action();
            }
            case "2" -> {
                CalculateFactorial.calculateFactorial(SCANNER);
                action();
            }
            case "3" -> {
                OddNumbersAndFactorianUseWhile.displayOddNumbers();
                OddNumbersAndFactorianUseWhile.calculateFactorial(SCANNER);
                action();
            }
            case "4" -> {
                OddNumbersAndFactorianUseDoWhile.displayOddNumbers();
                OddNumbersAndFactorianUseDoWhile.calculateFactorial(SCANNER);
                action();
            }
            case "5" -> {
                Exponenriation.exponentiation(SCANNER);
                action();
            }
            case "6" -> {
                SequenceOfNumber.outputSequenceOfNumbers();
                action();
            }
            case "7" -> {
                MultiplicationTable.printMultiplicationTable(SCANNER);
                action();
            }
            case "8" -> {
                FirstOddNumbers.outputAnArrayOfValues();
                action();
            }
            case "9" -> {
                SmallestNumber.findingSmallestNumber();
                action();
            }
            case "10" -> {
                LargestNumber.findLargestNumber();
                action();
            }
            case "11" -> {
                SwapElements.swapElements(createArray());
                action();
            }
            case "12" -> {
                ArithmeticMeanOfAllElements.findArithmeticMeanOfAllElements(createArray());
                action();
            }
            case "13" -> {
                ChessBoard.printChessBoard();
                action();
            }
            case "E" -> System.exit(0);
            default -> {
                System.out.println("You entered an invalid character (" + choice + ").\nTry again.");
                action();
            }
        }
    }

    public static int[] createArray() {
        int[] numbs = new int[0];

        System.out.print("""
                  [C] - Create an array of a specific size\s
                  [G] - Generate random array\s
                  [B] - Back to task selection
                Enter the appropriate character:\s""");
        String choice = SCANNER.next().toUpperCase();

        switch (choice) {
            case "C" -> {
                System.out.print("Enter a size value to create an array: ");
                numbs = new int[SCANNER.nextInt()];

                if (numbs.length < 1) {
                    System.out.println("Array size must be greater than 1.");
                    createArray();
                }

                for (int i = 0; i < numbs.length; i++) {
                    numbs[i] = RANDOM.nextInt(15);

                    if (RANDOM.nextInt(2) != 0) {
                        numbs[i] *= -1;
                    }
                }
            }
            case "G" -> {
                numbs = new int[RANDOM.nextInt(20)];

                if (numbs.length < 1) {
                    numbs = new int[1];
                }

                for (int i = 0; i < numbs.length; i++) {
                    numbs[i] = RANDOM.nextInt(20);

                    if (RANDOM.nextInt(2) != 0) {
                        numbs[i] *= -1;
                    }
                }
            }
            case "B" -> action();
            default -> {
                System.out.println("You entered an invalid character (" + choice + ").\nTry again.");
                action();
            }
        }
        return numbs;
    }
}
