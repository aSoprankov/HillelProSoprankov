package homework.hw3.task;

import java.util.Scanner;

public abstract class Task2 {
    public static void calculateFactorial(Scanner scanner) {
        System.out.print("""
                \s
                TASK 2.Use the for loop to calculate the factorial of n!.\s
                (!) For correct calculations, enter a value from 0 to 20.\s
                Enter N:\040""");
        int[] values = new int[scanner.nextInt()];
        long factorial = 0;

        if (values.length > 0) {
            factorial = 1;

            for (int i = 1; i < values.length; i++) {
                factorial += factorial * i;
            }
        }
        System.out.println("Factorial = " + factorial+ "\n");
    }
}
