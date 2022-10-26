package homework.hw4;

public class Car {
    private final float VOLUME_OF_THE_TANK;
    private final float FUEL_CONSUMPTION;
    private float fuelInTank;

    public Car(float VOLUME_OF_THE_TANK, float FUEL_CONSUMPTION, float fuelInTank) {
        this.VOLUME_OF_THE_TANK = VOLUME_OF_THE_TANK;
        this.FUEL_CONSUMPTION = FUEL_CONSUMPTION;
        this.fuelInTank = fuelInTank;
    }

    public float getFuelConsumption() {
        return FUEL_CONSUMPTION;
    }

    public float getFuelInTank() {
        return fuelInTank;
    }

    public float fillFullTank(float price) {
        float refuel = 0;
        System.out.println("Fuel in the tank: " + fuelInTank + " l");

        if (fuelInTank < VOLUME_OF_THE_TANK) {
            refuel = VOLUME_OF_THE_TANK - fuelInTank;
            System.out.println("Refueling at " + refuel + " l" +
                    "\nRefueling cost: " + String.format("%.2f", (refuel * price)) + " UAH");
        } else {
            System.out.println("Tank full");
        }
        fuelInTank = VOLUME_OF_THE_TANK;
        System.out.println("Fuel in the tank after refueling: " + fuelInTank + " l\n");

        return refuel;
    }

    public void findRemainingFuel(float fuelQuantity) {
        if (fuelInTank > fuelQuantity) {
            float remaining = fuelInTank - fuelQuantity;
            fuelInTank -= fuelQuantity;
            System.out.println("Amount of fuel after this trip: " + String.format("%.2f", remaining) + " l\n");
        }
    }

    public float findHowMuchToFillUp(float fuelQuantity, float fuelCost) {
        float refuel = 0;

        if (fuelInTank < fuelQuantity) {
            refuel = fuelQuantity - fuelInTank;
            System.out.println("Need to refuel: " + String.format("%.2f",refuel) + " l" +
                    "\nRefueling cost: " + String.format("%.2f", (refuel * fuelCost)) + " UAH\n");
        }

        return refuel * fuelCost;
    }
}
