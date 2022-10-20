package homework.hw3.task;

public class Task1 {
    private static int[] values;

    public static void displayOddNumbers() {
        values = new int[100];

        for (int value : values) {
            values[value]++;

            if (values[value] % 2 != 0) {
                System.out.print(values[value] + " ");
            }
        }
        System.out.println();
    }
}