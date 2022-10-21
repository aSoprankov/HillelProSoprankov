package homework.hw3.task;

import java.util.Scanner;

public class Task4 {
    public static void displayOddNumbers() {
        int[] values = new int[100];
        int counter = 0;

        do {
            if ((values[counter] = counter) % 2 != 0) {
                System.out.print(values[counter] + " ");
            }
            counter++;
        } while (counter != values.length);

        System.out.println("\n");
    }

    public static void calculateFactorial() {
        System.out.print("n: ");
        int[] values = new int[new Scanner(System.in).nextInt()];
        int counter = 0;
        int factorial = 1;

        do {
            if (values.length < 1) {
                factorial = 0;
                break;
            }

            values[counter] = counter + 1;
            factorial += factorial * values[counter] - factorial;
            counter++;
        } while (counter != values.length);

        System.out.println(factorial + "\n");
    }
}
