package homework.hw5;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentService studentService = new StudentService();

    public static void main(String[] args) {
        action();
    }

    private static void action() {
        System.out.print("""
                  [1] - Show the list of faculty students.
                  [2] - Show list of students for faculty and course.
                  [3] - show list of students born after given year.
                  [4] - show list of students of given group.
                  [E] - Exit.
                Enter:\040""");
        switch (scanner.next().toUpperCase()) {
            case "1" -> {
                System.out.print("Sociological | Philological\nEnter faculty: ");
                studentService.showTheListOfFacultyStudents(scanner.next().toUpperCase());
                action();
            }
            case "2" -> {
                System.out.print("Sociological | Philological\nEnter faculty: ");
                String faculty = scanner.next().toUpperCase();
                System.out.print("1 | 2 | 3 | 4\nEnter course: ");
                int course = scanner.nextInt();

                studentService.showListOfStudentsForFacultyAndCourse(faculty, course);
                action();
            }
            case "3" -> {
                System.out.print("Enter year: ");

                studentService.showListOfStudentsBornAfterGivenYear(scanner.nextInt());
                action();
            }
            case "4" -> {
                System.out.println("FS-221\nFS-320\nFS-419\nFP-121\nFP-221\nFP-321\nFP-419\nEnter group: ");

                studentService.showListOfStudentsOfGivenGroup(scanner.next().toUpperCase());
                action();
            }
            case "E" -> {

                System.exit(0);
            }
            default -> {
                System.out.println("Wrong character. Try again.");
                action();
            }
        }


















        /*
        for (int i = 0; i < database.length; i++) {
            System.out.println(database[i].toString());
        }

 */
    }
}
