package homework.hw3.task;

import java.util.Scanner;

public abstract class OddNumbersAndFactorianUseWhile {
    public static void displayOddNumbers() {
        System.out.print("""
                \s
                TASK 3. Rewrite programs using a while loop.\s
                Array:\040""");
        int[] values = new int[100];
        int counter = 0;

        while (counter != values.length) {
            if ((values[counter] = counter) % 2 != 0) {
                System.out.print(values[counter] + " ");
            }
            counter++;
        }
    }

    public static void calculateFactorial(Scanner scanner) {
        System.out.print("""
                \s
                TASK 3.2. (!) For correct calculations, enter a value from 0 to 20.\s
                Enter N:\040""");
        int[] values = new int[scanner.nextInt()];
        int counter = 1;
        long factorial = 0;

        if (values.length > 0) {
            factorial = 1;

            while (counter != values.length) {
                values[counter - 1] = counter;
                factorial += factorial * values[counter - 1];
                counter++;
            }
        }
        System.out.println("Factorial = " + factorial + "\n");
    }
}
