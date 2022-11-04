package homework.hw6.subscriber;

public class SubscriberServiceImpl implements SubscriberService {
    @Override
    public void displayUsersWhoExceedCityCall(Subscriber[] userBase, int time) {
        int counter = 0;
        System.out.println("Time of city call: " + time + " minutes.\n");

        for (int i = 0; i < userBase.length; i++) {
            if (userBase[i].getCityCallTime() > time * 60) {
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
    public void displayUsersWhoUsedIntercityCall(Subscriber[] userBase) {
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
    public int displayInternetTrafficConsumptionInCity(Subscriber[] userBase, String city) {
        int internetTraficInCity = 0;
        int counter = 0;

        for (int i = 0; i < userBase.length; i++) {
            if (userBase[i].getCity().toUpperCase().equals(city.toUpperCase())) {
                System.out.print("\n" + userBase[i].toString(4));
                counter++;
                internetTraficInCity += userBase[i].getInternetTraffic();
            }
        }

        if (counter < 1) {
            System.out.println("There is no such city in the database. Try again.");
        }

        return internetTraficInCity;
    }

    @Override
    public int displayNumberOfUsersWithNegativeBalance(Subscriber[] userBase) {
        int counter = 0;

        for (int i = 0; i < userBase.length; i++) {
            if (userBase[i].getBalance() < 0) {
                counter++;
                System.out.println(userBase[i].toString(5));
            }
        }

        if (counter < 1) {
            System.out.print("There are no users with a negative balance in the database.");
        }
        return counter;
    }

    @Override
    public void displayUsersByFirstLetterOfSurname(Subscriber[] userBase, String string) {
        char[] letters = string.toUpperCase().toCharArray();
        int counter = 0;

        for (int i = 0; i < userBase.length; i++) {
            char[] lettersSurname = userBase[i].getSurname().toUpperCase().toCharArray();

            if (letters[0] == lettersSurname[0]) {
                counter++;
                System.out.println("\n" + userBase[i].toString(3));
            }
        }

        if (counter < 1) {
            System.out.println("\nThere is not users whose surname starts with this letter.\n");
        }
    }
}
