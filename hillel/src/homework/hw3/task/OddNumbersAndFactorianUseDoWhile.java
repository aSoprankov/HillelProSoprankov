package homework.hw3.task;

import java.util.Scanner;

public class OddNumbersAndFactorianUseDoWhile {
    public static void displayOddNumbers() {
        System.out.print("""
                \s
                TASK 4. Rewrite programs using a do - while loop.\s
                collection.com.soprankov.Array:\040""");
        int[] values = new int[100];
        int counter = 0;

        do {
            if ((values[counter] = counter) % 2 != 0) {
                System.out.print(values[counter] + " ");
            }
            counter++;
        } while (counter != values.length);
    }

    public static void calculateFactorial(Scanner scanner) {
        System.out.print("""
                \s
                TASK 4.2. (!) For correct calculations, enter a value from 0 to 20.\s
                Enter N:\040""");
        int[] values = new int[scanner.nextInt()];
        int counter = 0;
        long factorial = 1;

        do {
            if (values.length < 1) {
                factorial = 0;
                break;
            }
            values[counter] = counter + 1;
            factorial += factorial * values[counter] - factorial;
            counter++;
        } while (counter != values.length);

        System.out.println("Factorial = " + factorial + "\n");
    }
}
