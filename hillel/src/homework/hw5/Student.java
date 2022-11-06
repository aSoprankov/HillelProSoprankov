package homework.hw5;

public class Student {
    private String id;
    private String surname;
    private String name;
    private String patronymic;
    private String dataBDay;
    private String address;
    private String phone;
    private String faculty;
    private String course;
    private String group;

    public Student(String id, String surname, String name, String patronymic, String dataBDay, String address,
                   String phone, String faculty, String course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dataBDay = dataBDay;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDataBDay() {
        return dataBDay;
    }

    public void setDataBDay(String dataBDay) {
        this.dataBDay = dataBDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String toString(int index) {
        String string = "";
        switch (index) {
            case 1 -> {
                string = surname + " " + name + " " + patronymic + " (ID: " + id + ")" +
                        "\nGroup: " + group + "(Course: " + course + ")" + "\nBDay: " + dataBDay +
                        "\nAddress: " + address + "\nPhone: " + phone + "\n";
            }
            case 2 -> {
                string = surname + " " + name + " " + patronymic + " (ID: " + id + ")" +
                        "\nGroup: " + group + "\nBDay: " + dataBDay + "\nAddress: " + address + "\nPhone: " + phone + "\n";
            }
            case 3 -> {
                string = surname + " " + name + " " + patronymic + " (ID: " + id + ") \nFaculty: " + faculty +
                        "\nGroup: " + group + "(Course: " + course + ")\nBDay: " +dataBDay + "\nAddress: " + address +
                        "\nPhone: " + phone + "\n";
            }
            case 4 -> {
                string = surname + " " + name + " " + patronymic + " (ID: " + id + ") \nFaculty: " + faculty +
                        "(Course: " + course + ")\nBDay: " +dataBDay + "\nAddress: " + address + "\nPhone: " + phone + "\n";
            }
        }
        return string;
    }
}
