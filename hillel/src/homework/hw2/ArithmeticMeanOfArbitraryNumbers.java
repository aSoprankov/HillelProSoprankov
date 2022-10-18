package homework.hw2;

import java.util.Random;
import java.util.Scanner;

public class ArithmeticMeanOfArbitraryNumbers {
    public static void main(String[] args) {
        int[] arr = new int[new Scanner(System.in).nextInt()];
        int sum = 0;
        float arithmetic;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
            System.out.print(arr[i] +" ");
            sum += arr[i];
        }

        arithmetic = sum / arr.length;
        System.out.print("\nResult " + arithmetic);
    }
}
