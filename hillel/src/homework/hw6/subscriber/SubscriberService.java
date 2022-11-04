package homework.hw6.subscriber;

public interface SubscriberService {

    public void displayUsersWhoExceedCityCall(Subscriber[] userBase, int time);

    public void displayUsersWhoUsedIntercityCall(Subscriber[] userBase);

    public int displayInternetTrafficConsumptionInCity(Subscriber[] userBase, String city);

    public int displayNumberOfUsersWithNegativeBalance(Subscriber[] userBase);

    public void displayUsersByFirstLetterOfSurname(Subscriber[] userBase, String letter);

}
