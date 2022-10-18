package homework.hw2;

public class Finance {
    public static void main(String[] args) {
        float deposit = Float.parseFloat(args[0]);
        float percentage = Float.parseFloat(args[1]);
        int years = Integer.parseInt(args[2]);
        int counter = 0;

        for(int i = 0; i < years; i++) {
            for(int j = 0; j < 12; j++) {
                deposit += deposit * (percentage / 12) / 100;
            }
            counter++;
            System.out.println("balance after " + counter + ": " + String.format("%.2f", deposit));
        }
    }
}
