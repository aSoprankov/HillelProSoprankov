package org.example.test;

import java.util.Scanner;

public class SymbolRunner {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Converter CONVERTER = new Converter();

    public static void main(String[] args) {
        action();
    }

    private static void action() {
        System.out.print("numbs: ");
        String string = SCANNER.next();

        CONVERTER.convertingValue(string.split(""));
        CONVERTER.printable();
    }
}
