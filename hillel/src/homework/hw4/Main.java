package homework.hw4;

public class Main {
    private static CarService car = new CarService();
    private static float totalCost = 0;

    public static void main(String[] args) {
        float fuelCost = Float.parseFloat(args[0]);
        action(fuelCost);
    }

    private static void action(float fuelCost) {
        String[] route = {"Odesa", "KryveOzero", "Zhashkiv", "Kyiv"};
        float[] distance = {178.5f, 152.8f, 148.2f};

        for (int i = 1; i < route.length; i++) {
            String tmpRoute = route[i - 1] + " -> " + route[i];
            float tmpDistance = distance[i - 1];

            System.out.println("\nRoute: " + tmpRoute + " (" + tmpDistance + "km)" +
                    "\nFuel for route: " + String.format("%.2f", car.determineFuelForRoute(tmpDistance)) + "l" +
                    "\nRemainder fuel: " + String.format("%.2f", car.getRemainder()) + "l");

            float tmpRfuel = car.determineRefuel(tmpDistance);

            if (tmpRfuel > 0) {
                float tmpTotalCost = tmpRfuel * fuelCost;
                System.out.println(
                        "Refueling " + String.format("%.2f", tmpRfuel) + "l cost " + String.format("%.2f",tmpTotalCost) + "UAH");

                totalCost += tmpTotalCost;
            }
            car.determineRemainder(tmpDistance);
        }

        System.out.println("\nRemainder after route " + String.format("%.2f", car.getRemainder()) + "l" +
                "\nMoney was spent: " + String.format("%.2f", totalCost) + "UAH");
    }
}
