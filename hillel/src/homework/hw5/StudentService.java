package homework.hw5;

import java.util.Arrays;

public class StudentService {
    private static Student[] dataBase = StudentsBase.createDatabase();
    public void showTheListOfFacultyStudents(String faculty) {
        System.out.println("\nFaculty: " + faculty);
        for (int i = 0; i < dataBase.length; i++) {
            if (faculty.equals(dataBase[i].getFaculty().toUpperCase())) {
                System.out.println(dataBase[i].toString(1));
            }
        }
    }

    public void showListOfStudentsForFacultyAndCourse(String faculty, int course) {
        System.out.println("\nFaculty: " + faculty + "\nCourse: " + course + "\n");
        for (int i = 0; i < dataBase.length; i++) {
            if (faculty.equals(dataBase[i].getFaculty().toUpperCase())) {
                if ((course == Integer.parseInt(dataBase[i].getCourse()))) {
                    System.out.println(dataBase[i].toString(2));
                }
            }
        }
    }

    public void showListOfStudentsBornAfterGivenYear(int year) {
        System.out.print("\nYear: " + year);
        for (int i = 0; i < dataBase.length; i++) {
            String[] array = dataBase[i].getDataBDay().split("-");
            if (year <= Integer.parseInt(array[array.length - 1])) {
                System.out.println(dataBase[i].toString(3));
            }
        }
    }

    public void showListOfStudentsOfGivenGroup(String group) {
        System.out.println("\nGroup: " + group);
        for (int i = 0; i < dataBase.length; i++) {
            if (group.equals(dataBase[i].getGroup())) {
                System.out.println(dataBase[i].toString(4));
            }
        }
    }
}
