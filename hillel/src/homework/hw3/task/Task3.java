package homework.hw3.task;

import java.util.Scanner;

public abstract class Task3 {
    public static void displayOddNumbers() {
        int[] values = new int[100];
        int counter = 0;

        while (counter != values.length) {
            if ((values[counter] = counter) % 2 != 0) {
                System.out.print(values[counter] + " ");
            }
            counter++;
        }
        System.out.println("\n");
    }

    public static void calculateFactorial() {
        System.out.print("n: ");
        int[] values = new int[new Scanner(System.in).nextInt()];
        int counter = 1;
        int factorial = 0;

        if (values.length > 0) {
            factorial = 1;

            while (counter != values.length) {
                values[counter - 1] = counter;
                factorial += factorial * values[counter - 1];
                counter++;
            }
        }
        System.out.println(factorial + "\n");
    }
}
