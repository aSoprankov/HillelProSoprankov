package org.example.task;

import java.util.List;

public class FilterStringCollection {
    public void filterCollection(List<String> lStrings) {
        lStrings.stream()
                .filter(s -> s.length() == 4)
                .filter(s -> s.equals(s.toLowerCase()))
                .forEach(s -> System.out.print(s + " "));
    }
}
