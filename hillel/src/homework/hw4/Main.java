package homework.hw4;

public class Main {
    private static Car car;
    private static float totalCost = 0;

    public static void main(String[] args) {
        float fuelCost = Float.parseFloat(args[0]);
        car = new Car(30f,  8.3f,  0f);
        action(fuelCost);
    }

    private static void action(float fuelCost) {
        String[] route = {"Odesa", "KryveOzero", "Zhashkiv", "Kyiv"};
        float[] distance = {178.5f, 152.8f, 148.2f};

        float fuelQuantity, refuel;

        totalCost += car.fillFullTank(fuelCost) * fuelCost;

        for (int i = 1; i < route.length; i++) {
            System.out.println("Route: " + route[i - 1] + " -> " + route[i] + "\nDistance: " + distance[i - 1] + " km");

            fuelQuantity = determineAmountOfFuel(distance[i - 1]);

            refuel = car.findHowMuchToFillUp(fuelQuantity, fuelCost);
            totalCost += refuel;

            car.findRemainingFuel(fuelQuantity);
        }
        System.out.println(
                "Remaining fuel at the final destination: " + String.format("%.2f", car.getFuelInTank()) + " l" +
                        "\nTotal cost of the trip: " + String.format("%.2f", totalCost) + " UAH");
    }

    private static float determineAmountOfFuel(float distance) {
        float fuelQuantity = distance / 100 * car.getFuelConsumption();
        System.out.println("Fuel in the tank: " + String.format("%.2f", car.getFuelInTank()) + " l\n" +
                "Need fuel: " + String.format("%.2f", fuelQuantity) + " l");
        return fuelQuantity;
    }
}
