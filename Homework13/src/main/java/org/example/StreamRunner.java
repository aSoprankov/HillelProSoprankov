package org.example;

import java.util.List;

import org.example.task.ArithmeticMean;
import org.example.task.ChangeStringCollection;
import org.example.task.FilterStringCollection;


public class StreamRunner {
    public static void main(String[] args) {
        new ArithmeticMean().findArithmeticMean(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        new ChangeStringCollection().changeCollection(new String[]{"one", "two", "tree", "four", "five"});

        new FilterStringCollection()
                .filterCollection(List.of("One", "two", "TREE", "four", "Five", "Six", "seven", "Eight", "nine"));
    }
}
