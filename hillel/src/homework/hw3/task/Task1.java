package homework.hw3.task;

public abstract class Task1 {
    public static void displayOddNumbers() {
        System.out.print("""
                \s
                TASK 1. Use a for loop to display odd numbers from 1 to 99.\s
                Array: \040""");
        int[] values = new int[100];

        for (int value : values) {
            values[value]++;

            if (values[value] % 2 != 0) {
                System.out.print(values[value] + " ");
            }
        }
        System.out.println("\n");
    }
}