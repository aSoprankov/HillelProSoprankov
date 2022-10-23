package homework.hw3.task;

import java.util.Scanner;

public abstract class Task7 {
    public static void printMultiplicationTable(Scanner scanner) {
        System.out.print("""
                \s
                TASK 7. Write the multiplication table for X.\s
                Enter X:\040""");
        int numb = scanner.nextInt();
        System.out.println("Multiplication table: ");
        for (int i = 1; i <= 10; i++) {
            int value = numb * i;
            System.out.print(numb + "x" + i + "=" + value + "\n");
        }
        System.out.println();
    }
}
