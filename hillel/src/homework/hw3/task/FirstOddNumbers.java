package homework.hw3.task;

public abstract class FirstOddNumbers {
    public static void outputAnArrayOfValues() {
        System.out.print("""
                \s
                TASK 8. Create and output an array of 10 elements that contains the first 10 odd numbers.\s
                RESULT:\040""");
        int[] values = new int[10];
        int counter = 0;
        int value = 0;

        while (counter < values.length) {
            if (value % 2 != 0) {
                values[counter] = value;

                if (counter == values.length - 1) {
                    System.out.print(values[counter]);
                    break;
                }
                System.out.print(values[counter] + ",");
                counter++;
            }
            value++;
        }
        System.out.println("\n");
    }
}
