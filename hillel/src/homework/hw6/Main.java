package homework.hw6;

import homework.hw6.subscriber.Subscriber;
import homework.hw6.subscriber.SubscriberServiceImpl;
import homework.hw6.subscriber.UserBase;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SubscriberServiceImpl ssi = new SubscriberServiceImpl();

    private static final Subscriber[] userBase = UserBase.createUserBase();

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
                System.out.print("""
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Display users who exceed city call:
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Input time:\040""");
                ssi.displayUsersWhoExceedCityCall(userBase, scanner.nextInt());
                action();
            }
            case "2" -> {
                System.out.println("""
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Display users who used intercity call:
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -""");
                ssi.displayUsersWhoUsedIntercityCall(userBase);
                action();
            }
            case "3" -> {
                System.out.print("""
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Display users by first letter of surname:
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Input letter:\040""");
                ssi.displayUsersByFirstLetterOfSurname(userBase, scanner.next());
                action();
            }
            case "4" -> {
                System.out.print("""
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Display internet traffic consumption in city:
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Kyiv | Chernihiv | Lviv | Odesa | Kharkiv
                        Input city:\040""");
                int traffic = ssi.displayInternetTrafficConsumptionInCity(userBase, scanner.next());

                if (traffic > 0) {
                    System.out.println("\nTotal internet trafic in city: " + traffic / 1000 + " Gb");
                }
                action();
            }
            case "5" -> {
                System.out.println("""
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                        Display number of users with negative balance:
                        - - - - - - - - - - - - - - - - - - - - - - - - - - - - -""");
                int counter = ssi.displayNumberOfUsersWithNegativeBalance(userBase);
                System.out.println("Users with negative balance: " + counter);
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
