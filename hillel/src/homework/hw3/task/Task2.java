package homework.hw3.task;

import java.util.Scanner;

public class Task2 {
    public static void calculateFactorial() {
        System.out.print("n: ");
        int[] values = new int[new Scanner(System.in).nextInt()];
        int factorial = 0;

        for (int value : values) {
            values[value]++;
        }

        if (values.length > 0) {
            factorial = 1;

            for (int i = 1; i < values.length; i++) {
                factorial += factorial * i;
            }
        }

        System.out.println(factorial);
    }
}
