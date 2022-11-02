package homework.hw6;

import homework.hw6.subscriber.SubscriberServiceImpl;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SubscriberServiceImpl ssi = new SubscriberServiceImpl();

    public static void main(String[] args) {
        action();
    }

    private static void action() {
        System.out.print("""
                = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
                Select the desired action:
                 [1] Display users who exceed city call.
                 [2] Display users who used intercity call.
                 [3] Display users by first letter of surname.
                 [4] Display internet traffic consumption in city.
                 [5] Display number of users with negative balance.
                 [E] Exit the prorgam.
                Select:\040""");
        String userChoice = scanner.next().toUpperCase();

        switch (userChoice) {
            case "1" -> {
                System.out.println("""
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Display users who exceed city call:
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -""");
                ssi.displayUsersWhoExceedCityCall();
                action();
            }
            case "2" -> {
                System.out.println("""
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Display users who used intercity call:
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -""");
                ssi.displayUsersWhoUsedIntercityCall();
                action();
            }
            case "3" -> {
                System.out.println("""
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Display users by first letter of surname:
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -""");
                ssi.displayUsersByFirstLetterOfSurname();
                action();
            }
            case "4" -> {
                System.out.println("""
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Display internet traffic consumption in city:
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -""");
                ssi.displayInternetTrafficConsumptionInCity();
                action();
            }
            case "5" -> {
                System.out.println("""
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Display number of users with negative balance:
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -""");
                ssi.displayNumberOfUsersWithNegativeBalance();
                action();
            }
            case "E" -> {
                System.out.println("\nExit the prorgam.");
                System.exit(0);
            }
            default -> {
                System.out.println("\nWrong select. Try again.\n");
                action();
            }
        }
    }
}
