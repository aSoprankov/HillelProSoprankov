package homework.hw2;

import java.util.Scanner;

public class ArithmeticMeanOfTwoNumbers {
    public static void main(String[] args) {
        float[] arr = new float[2];
        float arithmetic;

        for (int i = 0; i < arr.length; i++)
            arr[i] = new Scanner(System.in).nextFloat();


        arithmetic = (arr[0] + arr[1]) / arr.length;

        System.out.println("value1 " + arr[0] + " value2 " + arr[1] + " result " + arithmetic);
    }
}
