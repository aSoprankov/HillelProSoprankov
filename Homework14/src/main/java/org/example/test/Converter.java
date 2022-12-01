package org.example.test;

import java.util.Arrays;

public class Converter {
    private final StringBuilder[] S_BUILDERS = new StringBuilder[5];

    Converter() {
        Arrays.setAll(S_BUILDERS, a -> new StringBuilder());
    }

    public void convertingValue(String[] strings) {
        Arrays.stream(strings).forEach(this::addString);
    }

    private void addString(String s) {
        String[] strings = SymbolDatabase.getString(s).split("\\.");

        for (int i = 0; i < S_BUILDERS.length; i++) {
            S_BUILDERS[i].append(strings[i]).append("  ");
        }
    }

    public void printable() {
        Arrays.stream(S_BUILDERS).forEach(System.out::println);
    }
}
