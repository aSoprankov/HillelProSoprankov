package homework.hw6.subscriber;

public class Subscriber {
    private String identifier;
    private String name;
    private String surname;
    private String patronymic;
    private String city;
    private String phone;
    private String contractNumber;
    private float balance;
    private int cityCallTime;
    private int intercityCallTime;
    private int internetTraffic;

    public Subscriber(String identifier, String name, String surname, String patronymic, String city, String phone,
                      String contractNumber, float balance, int cityCallTime, int intercityCallTime,
                      int internetTraffic) {
        this.identifier = identifier;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.city = city;
        this.phone = phone;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.cityCallTime = cityCallTime;
        this.intercityCallTime = intercityCallTime;
        this.internetTraffic = internetTraffic;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getCityCallTime() {
        return cityCallTime;
    }

    public void setCityCallTime(int cityCallTime) {
        this.cityCallTime = cityCallTime;
    }

    public int getIntercityCallTime() {
        return intercityCallTime;
    }

    public void setIntercityCallTime(int intercityCallTime) {
        this.intercityCallTime = intercityCallTime;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public String toString(int index) {
        String result = "";

        switch (index) {
            case 1 -> {
                result = "Identifier: " + identifier + "\nContract number: №" + contractNumber +
                        "\nFull name: " + surname + " " + name + " " + patronymic + "\nCity: " + city +
                        "\nPhone number: " + phone + "\nCity call time: " + convertTime(cityCallTime) + "\n";
            }
            case 2 -> {
                result = "Identifier: " + identifier + "\nContract number: №" + contractNumber +
                        "\nFull name: " + surname + " " + name + " " + patronymic + "\nCity: " + city +
                        "\nPhone number: " + phone + "\nIntercity call time: " + convertTime(intercityCallTime) + "\n";
            }
            case 3 -> {
                result = "Identifier: " + identifier + "\nContract number: №" + contractNumber +
                        "\nFull name: " + surname + " " + name + " " + patronymic +
                        "\nCity: " + city + "\nPhone: " + phone + "\nBalance: " + balance + " uah" +
                        "\nCity call time: " + convertTime(cityCallTime) +
                        "\nLong distance call time: " + convertTime(intercityCallTime) +
                        "\nInternet traffic: " + internetTraffic + " Gb";
            }
            case 4 -> {
                result = "Identifier: " + identifier + "\nContract number: №" + contractNumber +
                        "\nFull name: " + surname + " " + name + " " + patronymic + "\nCity: " + city +
                        "\nPhone number: " + phone + "\nInternet trafic: " + internetTraffic + " Mb\n";
            }
            case 5 -> {
                result = "Identifier: " + identifier + "\nContract number: №" + contractNumber +
                        "\nFull name: " + surname + " " + name + " " + patronymic + "\nCity: " + city +
                        "\nPhone number: " + phone + "\nBalance: " + balance + " UAH\n";
            }
        }
        return result;
    }

    public String convertTime(int timeInSecond) {
        String time = "";

        int tmpMinute = timeInSecond % 3600;
        int hour = (timeInSecond - tmpMinute) / 3600;
        int second = tmpMinute % 60;
        int minute = (tmpMinute - second) / 60;

        if (hour > 9) {
            time += hour + ":";
        } else if (hour > 0) {
            time += "0" + hour + ":";
        } else {
            time += "00:";
        }

        if (minute > 9) {
            time += minute + ":";
        } else if (minute > 0) {
            time += "0" + minute + ":";
        } else {
            time += "00:";
        }

        if (second > 9) {
            time += second;
        } else if (second > 0) {
            time += "0" + second;
        } else {
            time += "00";
        }

        return time;
    }
}
