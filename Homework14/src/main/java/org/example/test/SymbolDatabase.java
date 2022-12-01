package org.example.test;

import java.util.HashMap;

public abstract class SymbolDatabase {
    public static String getString(String s) {
        HashMap<String, String> map = new HashMap<>();
        map.put("0", " @@@@ .@@  @@.@@  @@.@@  @@. @@@@ ");
        map.put("1", "  @@  . @@@  .  @@  .  @@  .@@@@@@");
        map.put("2", " @@@@ .@    @.   @@ . @@   .@@@@@@");
        map.put("3", "@@@@@ .    @@.  @@@ .    @@.@@@@@ ");
        map.put("4", "   @@@.  @ @@. @  @@.@@@@@@.    @@");
        map.put("5", "@@@@@ .@@    .@@@@@ .    @@.@@@@@ ");
        map.put("6", " @@@@ .@@    .@@@@@ .@@  @@. @@@@ ");
        map.put("7", "@@@@@@.   @@ .  @@  . @@   .@@    ");
        map.put("8", " @@@@ .@@  @@. @@@@ .@@  @@. @@@@ ");
        map.put("9", " @@@@ .@@  @@. @@@@@.    @@. @@@@ ");

        return map.get(s);
    }
}
