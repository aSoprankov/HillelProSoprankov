package org.example.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ChangeStringCollection {
    public static List<Pair> changeCollection(String[] lStrings) {
        List<Pair> lPair = new ArrayList<>(lStrings.length);
        Arrays.stream(lStrings).forEach(n -> lPair.add(new Pair(n)));
        return lPair;
    }


    public static class Pair {
        final String[] strings = new String[2];

        Pair(String string) {
            strings[0] = string;
            strings[1] = strings[0].toUpperCase();
        }

        public String toString() {
            return "{" + strings[0] + ":" + strings[1] + "}";
        }
    }
}
