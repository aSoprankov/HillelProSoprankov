package homework.hw6.subscriber;

import java.util.Scanner;

public class SubscriberServiceImpl implements SubscriberService {
    private final Subscriber[] userBase = UserBase.createUserBase();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void displayUsersWhoExceedCityCall() {
        int excess = 30;
        int counter = 0;
        System.out.println("Time of city call: " + excess + " minutes.\n");

        for (int i = 0; i < userBase.length; i++) {
            if (convertSecondsToMinutes(userBase[i].getCityCallTime()) > excess) {
                counter++;
                System.out.println(userBase[i].toString(1));
            }
        }

        if (counter < 1) {
            System.out.println("There are no users in the database who have exceeded conversation on city call.");
            return;
        }
    }

    @Override
    public void displayUsersWhoUsedIntercityCall() {
        int counter = 0;

        for (int i = 0; i < userBase.length; i++) {
            if (userBase[i].getIntercityCallTime() > 0) {
                counter++;
                System.out.println(userBase[i].toString(2));
            }
        }

        if (counter < 1) {
            System.out.println("There are no users in the database who used intercity calls.");
            return;
        }
    }

    @Override
    public void displayUsersByFirstLetterOfSurname() {
        System.out.print("Input first name latter: ");
        char[] letterSearch = scanner.next().toUpperCase().toCharArray();
        int counter = 0;

        for (int i = 0; i < userBase.length; i++) {
            char[] lettersSurname = userBase[i].getSurname().toUpperCase().toCharArray();

            if (letterSearch[0] == lettersSurname[0]) {
                counter++;
                System.out.println("\n" + userBase[i].toString(3));
            }
        }

        if (counter < 1) {
            System.out.println("\nThere is not users whose surname starts with this letter.\n");
            displayUsersByFirstLetterOfSurname();
        }
    }

    @Override
    public void displayInternetTrafficConsumptionInCity() {
        System.out.print("Input city (example Kyiv): ");
        String inputCity = scanner.nextLine().toUpperCase();
        int internetTraficInCity = 0;
        int counter = 0;

        for (int i = 0; i < userBase.length; i++) {
            if (userBase[i].getCity().toUpperCase().equals(inputCity)) {
                System.out.println(userBase[i].toString(4));
                counter++;
                internetTraficInCity += userBase[i].getInternetTraffic();
            }
        }

        if (counter < 1) {
            System.out.println("\nThere is no such city in the database. Try again.\n");
            displayInternetTrafficConsumptionInCity();
        }

        System.out.println("\nTotal internet trafic in city: " + internetTraficInCity / 1000 + " Gb");
    }

    @Override
    public void displayNumberOfUsersWithNegativeBalance() {
        int counter = 0;

        for (int i = 0; i < userBase.length; i++) {
            if (userBase[i].getBalance() < 0) {
                counter++;
                System.out.println(userBase[i].toString(5));
            }
        }

        if (counter < 1) {
            System.out.println("There are no users with a negative balance in the database.");
            return;
        }
        System.out.println("Users with negative balance: " + counter);
    }

    public int convertSecondsToMinutes(int seconds) {
        String string = "";

        int sec = seconds % 60;
        int min = (seconds - sec) / 60;

        return min;
    }
}
