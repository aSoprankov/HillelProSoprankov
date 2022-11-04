package homework.hw6.subscriber;

import homework.hw6.subscriber.Subscriber;

public abstract class UserBase {
    private static Subscriber[] userBase = new Subscriber[10];

    public static Subscriber[] createUserBase() {
        userBase[0] = new Subscriber("001", "Makar", "Yaroshenko", "Ivanovich",
                "Kyiv", "+38 (097) 321 54 97", "A001", 163.52f, 1543,
                0, 4000);
        userBase[1] = new Subscriber("002", "Dmitriy", "Moskalenko", "Antonovich",
                "Lviv", "+38 (097) 627 24 37", "A002", -3.67f, 634,
                0, 2000);
        userBase[2] = new Subscriber("003", "Sergey", "Fedorenko", "Petrovich",
                "Chernihiv", "+38 (097) 657 58 79", "A003", 23.51f, 1037,
                354, 1000);
        userBase[3] = new Subscriber("004", "Ivan", "Simonenko", "Stepanovich",
                "Kyiv", "+38 (097) 647 34 12", "A004", 134.2f, 336,
                0, 10000);
        userBase[4] = new Subscriber("005", "Timur", "Kirichenko", "Stanisvalovoch",
                "Odesa", "+38 (097) 321 56 79", "A005", 17.67f, 1586,
                0, 6000);
        userBase[5] = new Subscriber("006", "Valeriy", "Ignatenko", "Maksimovich",
                "Kharkiv", "+38 (097) 637 12 64", "A006", 92.5f, 1236,
                0, 7000);
        userBase[6] = new Subscriber("007", "Anna", "Simonenko", "Sergeevna",
                "Lviv", "+38 (097) 354 53 22", "A007", 10.34f, 3387,
                76, 2000);
        userBase[7] = new Subscriber("008", "Marina", "Kirilinko", "Nikolaevna",
                "Kyiv", "+38 (097) 657 21 47", "A008", 36.68f, 426,
                0, 0);
        userBase[8] = new Subscriber("009", "Sofiya", "Saenko", "Anatolievna",
                "Chernihiv", "+38 (097) 157 78 23", "A009", -0.13f, 1369,
                0, 2000);
        userBase[9] = new Subscriber("010", "Katerina", "Ivanenko", "Vladislavovna",
                "Odesa", "+38 (097) 167 27 37", "A010", 13.38f, 3671,
                361, 5000);
        return userBase;
    }
}
