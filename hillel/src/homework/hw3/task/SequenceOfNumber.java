package homework.hw3.task;

import java.util.Arrays;

public abstract class SequenceOfNumber {
    public static void outputSequenceOfNumbers() {
        System.out.println("""
                \s
                TASK 6. Output the first 10 numbers, numerical order 0, -5, -10, -15 and so on.\s
                RESULT:\040""");
        int[] array = new int[10];
        int counter = 0;
        int value = 0;

        do {
            array[counter] = value;
            value -= 5;
            counter++;
        } while (counter < 10);

        System.out.println(Arrays.toString(array) + "\n");
    }
}
