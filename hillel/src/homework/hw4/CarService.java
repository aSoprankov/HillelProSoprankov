package homework.hw4;

public class CarService extends Car {

    private float fillTheTank(float distance) {    //заправить
        float refuel = getTank() - getRemainder();

        setRemainder(getTank());
        System.out.println("Refueling: " + String.format("%.2f", refuel) + "l \nRemainder fuel: " + getRemainder() + "l");

        return refuel;
    }

    public void determineRemainder(float distance) {
        setRemainder(getRemainder() - distance * getConsumption() / 100);
    }

    public float determineRefuel(float distance) {
        float fuelForRoute = determineFuelForRoute(distance);
        float refuel = 0;

        if (fuelForRoute > getRemainder()) {
            float tmpFuel = fuelForRoute - getRemainder();

            if (getTank() / 2 > getRemainder()) {
                System.out.println("Tank is less than half. You need a full refueling.");
                refuel = fillTheTank(distance);
            } else {
                System.out.println("Need to refuel: " + tmpFuel + "l");
                setRemainder(getRemainder() + tmpFuel);
            }

        } else {
            System.out.println("There is enough fuel in tank.");
        }
        return refuel;
    }

    public float determineFuelForRoute(float distance) {
        return getConsumption() * distance / 100;
    }
}
