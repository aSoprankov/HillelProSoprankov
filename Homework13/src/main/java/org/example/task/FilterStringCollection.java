package org.example.task;

import java.util.ArrayList;
import java.util.List;

public abstract class FilterStringCollection {
    public static List<String> filterCollection(List<String> lStrings) {
        List<String> tmpList = new ArrayList<>();
        lStrings.stream()
                .filter(s -> s.length() == 4)
                .filter(s -> s.equals(s.toLowerCase()))
                .forEach(tmpList::add);
        return tmpList;
    }
}
