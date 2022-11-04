package homework.hw5;

public class Main {
    public static void main(String[] args) {
        action();
    }

    private static void action() {
        Student[] database = StudentsDatabase.createDatabase();

        for (int i = 0; i < database.length; i++) {
            System.out.println(database[i].toString());
        }
    }
}
