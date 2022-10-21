package homework.hw3;

import homework.hw3.task.Task1;
import homework.hw3.task.Task2;
import homework.hw3.task.Task3;
import homework.hw3.task.Task4;

public abstract class Action {
    public static void action() {
        System.out.println("task1: display odd numbers");
        Task1.displayOddNumbers();

        System.out.println("task2: calculate factorial");
        Task2.calculateFactorial();

        System.out.println("task3: complete task1 and task2 using while");
        Task3.displayOddNumbers();
        Task3.calculateFactorial();

        System.out.println("task3: complete task1 and task2 using do-while");
        Task4.displayOddNumbers();
        Task4.calculateFactorial();
    }
}
