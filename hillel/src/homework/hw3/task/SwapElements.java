package homework.hw3.task;

import java.util.Arrays;

public abstract class SwapElements {
   public static void swapElements(int[] array) {
       System.out.println("\nTASK 11. Swap the largest and smallest elements of an array.");
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       int minIndex = 0;
       int maxIndex = 0;

       System.out.println(Arrays.toString(array));
       for (int i = 0; i < array.length; i++) {
           if (max < array[i]) {
               max = array[i];
               maxIndex = i;
           }
           if (min > array[i]){
               min = array[i];
               minIndex = i;
           }
       }

       System.out.println("Minimum value: " + min +
               "\nMaximum value: " + max);

       for (int i = 0; i < array.length; i++) {
           if (i == minIndex) {
               array[i] = max;
           }
           if (i == maxIndex) {
               array[i] = min;
           }
       }
       System.out.println(Arrays.toString(array) + "\n");
   }
}
