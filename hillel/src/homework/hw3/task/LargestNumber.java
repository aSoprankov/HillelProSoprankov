package homework.hw3.task;

public abstract class LargestNumber {
    private static final int[] ARRAY = SmallestNumber.getArray();
    public static void findLargestNumber() {
        int counter = 1;
        System.out.println("\nTASK 10. In the array from task 9. find the largest element.");

        for (int i = ARRAY.length - 1; i >= 0; i--) {
            if (ARRAY[ARRAY.length - 1] == ARRAY[ARRAY.length - 2]) {
                counter++;
            } else {
                break;
            }
        }
        System.out.print("Maximum value: ");
        for (int i = 0; i < counter; i++) {
            System.out.print(ARRAY[ARRAY.length - 1] + " ");
        }
        System.out.println("\n");
    }
}
