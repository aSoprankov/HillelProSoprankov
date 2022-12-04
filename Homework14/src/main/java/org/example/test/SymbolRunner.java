package org.example.test;

import java.util.Scanner;

public class SymbolRunner {
    private static final Converter CONVERTER = new Converter();

    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
            action();
    }

    private static void action() {
        System.out.print("numbs: ");

        String string = SCANNER.next();

        try {
            Integer.parseInt(string);
        } catch (NumberFormatException ex) {
            System.err.println(ex.getMessage() + "\nInput only numbers");
            System.exit(0);
        }

        CONVERTER.convertingValue(string.split(""));
        CONVERTER.printSymbol();
    }
}
