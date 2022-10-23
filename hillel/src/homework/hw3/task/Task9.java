package homework.hw3.task;

import homework.hw3.Action;

import java.util.Arrays;

public abstract class Task9 {
    private static int[] array = new int[0];

    public static void setArray() {
        array = Action.createArray();
    }

    public static int[] getArray() {
        return array;
    }

    public static void findingSmallestNumber() {
        int counter = 1;
        System.out.println("\nTASK 9. Find the smallest element of the array and print it (if there are several, print them all).");
        setArray();
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                counter++;
            } else {
                break;
            }
        }

        System.out.print("Minimum value: ");
        for (int i = 0; i < counter; i++) {
            System.out.print(array[0] + " ");
        }
        System.out.println("\n");
    }
}
