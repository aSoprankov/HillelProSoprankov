package homework.hw3.task;

import java.util.Arrays;

public abstract class Task12 {
    public static void findArithmeticMeanOfAllElements(int[] array) {
        float result = 0;

        System.out.println("\nTASK 12. Find the arithmetic mean of all array elements.");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] *= -1;
            }
            result += array[i];
        }
        System.out.println(Arrays.toString(array) +
                "\nResult: " + result / array.length + "\n");
    }
}
