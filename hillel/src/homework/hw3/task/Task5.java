package homework.hw3.task;

import java.util.Scanner;

public class Task5 {
    public static void exponentiation(Scanner scanner) {
        System.out.print("\nTASK 5. Enter X and N values and calculate X^N.\nEnter X: ");
        int x = scanner.nextInt();
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        int result = 1;

        do {
            result *= x;
            n--;
        } while (n > 0);

        System.out.println("X^N = " + result + "\n");
    }
}
