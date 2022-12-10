package org.example.texture;

public abstract class TextureDatabase {
    protected String welcomeTexture() {
        return """
                ░░░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░░░
                ░▒▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▒░
                ░▒▓▓░░██▒░░░░░██▒░██████▒░██▒░░░░░░██████▒░░░██████▒░░░░██▒░██▒░░░██████▒░░░▓▓▒░
                ░▒▓▓░░██▒░░░░░██▒░██▒░░░░░██▒░░░░░██▒░░░██▒░██▒░░░██▒░░████████▒░░██▒░░░░░░░▓▓▒░
                ░▒▓▓░░██▒░██▒░██▒░██████▒░██▒░░░░░██▒░░░░░░░██▒░░░██▒░██▒░██▒░██▒░██████▒░░░▓▓▒░
                ░▒▓▓░░░████████▒░░██▒░░░░░██▒░░░░░██▒░░░██▒░██▒░░░██▒░██▒░░░░░██▒░██▒░░░░░░░▓▓▒░
                ░▒▓▓░░░░██▒░██▒░░░██████▒░██████▒░░██████▒░░░██████▒░░██▒░░░░░██▒░██████▒░░░▓▓▒░
                ░▒▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▒░
                ░░░░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░░░""";
    }

    protected String menuTexture() {
        return """
                ░░░░▒░▓░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░▓░▒░░░░
                ░░░▒░▓░▒░ ╔══════════════╦════════════════╦═════════════╦════════════╗ ░▒░▓░▒░░░
                ░░▒░▓░▒░░ ║ [1] - STONE  ║ [2] - SCISSORS ║ [3] - PAPER ║ [0] - EXIT ║ ░░▒░▓░▒░░
                ░▒░▓░▒░░░ ╚══════════════╩════════════════╩═════════════╩════════════╝ ░░░▒░▓░▒░
                ▒░▓░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░▓░▒""";
    }

    protected String shapeTexture(int choice) {
        String shape;
        switch (choice) {
            case 0 -> shape = "░░░░░░░████████░░░░░░░░░░░░░░░░░░░░░░░░▒.░░░░░██        ██░░░░░░░░░░░░░░░░░░░░░▒▒." +
                              "░░░██      ████████████░░░░░░░░░░░░░░▒▒░.░██                    █░░░░░░░░░░░░▒▒░▒." +
                              "█               ██████████░░░░░░░░░▒▒░▒▒.█                         █░░░░░░░▒▒░▒▒▒." +
                              "█               ██████████░░░░░░░▒▒░▒▒▒█.█                      █░░░░░░░░▒▒░▒▒▒█▒." +
                              "░█           ██████████░░░░░░░░▒▒░▒▒▒█▒▒.░░███              █░░░░░░░░░░▒▒░▒▒▒█▒▒▒." +
                              "░░░░░██████████████░░░░░░░░░░▒▒░▒▒▒█▒▒▒░.░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░▒▒▒█▒▒▒░▒";
            case 1 -> shape = "░░░░░░░████████░░░░░░░░░░░░░░██████░░░░▒.░░░░░██        ██░░░░░░██████      █░░▒▒." +
                              "░░░██      ████████████        ████░░▒▒░.░██                      ██████░░░░░▒▒░▒." +
                              "█               █████████░░░░░░░░░░▒▒░▒▒.█                        ██████░░░▒▒░▒▒▒." +
                              "█               ███████        ████░▒▒▒█.█                      ██████      █▒▒█▒." +
                              "░█           █████████░░░░░░░██████▒▒█▒▒.░░███              █░░░░░░░░░░▒▒░▒▒▒█▒▒▒." +
                              "░░░░░██████████████░░░░░░░░░░▒▒░▒▒▒█▒▒▒░.░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░▒▒▒█▒▒▒░▒";
            case 2 -> shape = "░░░░░░░████████████░░░░░░░░░░░░░░░░░░░░▒.░░░░░██            █░░░░░░░░░░░░░░░░░░▒▒." +
                              "░░░██        █████████████████░░░░░░░▒▒░.░██                           █░░░░░▒▒░▒." +
                              "█               █████████████████░░▒▒░▒▒.█                                █▒▒░▒▒▒." +
                              "█               █████████████████▒▒░▒▒▒█.█                            █░░▒▒░▒▒▒█▒." +
                              "░█           ████████████████░░▒▒░▒▒▒█▒▒.░░███                    █░░░░▒▒░▒▒▒█▒▒▒." +
                              "░░░░░████████████████████░░░░▒▒░▒▒▒█▒▒▒░.░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░▒▒▒█▒▒▒░▒";
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
        return shape;
    }

    protected String winnerTexture(int result) {
        String[] elements = {
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░." +
                "░░░██▒░░░░░██████▒░░██████▒░██████▒░░░░░░░██▒░░░░░░░██▒░░░░░██▒████▒██▒░░░██▒░░░." +
                "░░░██▒░░░░██▒░░░██▒██▒░░░░░░██▒░░░░░░█████  ██▒░░░░░██▒░░░░░██▒░██▒░███▒░░██▒░░░." +
                "░░░██▒░░░░██▒░░░██▒░░████▒░░██████▒░░█        ██▒░░░██▒░██▒░██▒░██▒░██▒██▒██▒░░░." +
                "░░░██▒░░░░██▒░░░██▒░░░░░░██▒██▒░░░░░░█████  ██▒░░░░░░████████▒░░██▒░██▒░░███▒░░░." +
                "░░░██████▒░██████▒░░██████▒░██████▒░░░░░░░██▒░░░░░░░░░██▒░██▒░░████▒██▒░░░██▒░░░." +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░",
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░." +
                "░░░██▒░░░██▒░░██████▒░░░░░██▒░░░░░██▒████▒██▒░░░██▒░██▒░░░██▒░██████▒░██████▒░░░." +
                "░░░███▒░░██▒░██▒░░░██▒░░░░██▒░░░░░██▒░██▒░███▒░░██▒░███▒░░██▒░██▒░░░░░██▒░░██▒░░." +
                "░░░██▒██▒██▒░██▒░░░██▒░░░░██▒░██▒░██▒░██▒░██▒██▒██▒░██▒██▒██▒░██████▒░██▒░░██▒░░." +
                "░░░██▒░░███▒░██▒░░░██▒░░░░░████████▒░░██▒░██▒░░███▒░██▒░░███▒░██▒░░░░░██████▒░░░." +
                "░░░██▒░░░██▒░░██████▒░░░░░░░██▒░██▒░░████▒██▒░░░██▒░██▒░░░██▒░██████▒░██▒░░██▒░░." +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░",
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░." +
                "░░░██▒░░░░░██▒████▒██▒░░░██▒░░░░░░░░██▒░░░░░░░██▒░░░░░██████▒░░██████▒░██████▒░░." +
                "░░░██▒░░░░░██▒░██▒░███▒░░██▒░░░░░░██  █████▒░░██▒░░░░██▒░░░██▒██▒░░░░░░██▒░░░░░░." +
                "░░░██▒░██▒░██▒░██▒░██▒██▒██▒░░░░██        █▒░░██▒░░░░██▒░░░██▒░░████▒░░██████▒░░." +
                "░░░░████████▒░░██▒░██▒░░███▒░░░░░░██  █████▒░░██▒░░░░██▒░░░██▒░░░░░░██▒██▒░░░░░░." +
                "░░░░░██▒░██▒░░████▒██▒░░░██▒░░░░░░░░██▒░░░░░░░██████▒░██████▒░░██████▒░██████▒░░." +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░"
        };
        return elements[result + 1];
    }

    protected String gameOverTexture() {
        return """
                ░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░
                ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                ░░░█████▒░░░█████▒░░░░██▒░██▒░░░██████▒░░░░░██████▒░██▒░░░░██▒██████▒░██████▒░░░
                ░░██▒░░░░░░██▒░░██▒░░████████▒░░██▒░░░░░░░░██▒░░░██▒██▒░░░░██▒██▒░░░░░██▒░░██▒░░
                ░░██▒░███▒░██▒░░██▒░██▒░██▒░██▒░██████▒░░░░██▒░░░██▒░██▒░░██▒░██████▒░██▒░░██▒░░
                ░░██▒░░██▒░███████▒░██▒░░░░░██▒░██▒░░░░░░░░██▒░░░██▒░░██▒██▒░░██▒░░░░░██████▒░░░
                ░░░█████▒░░██▒░░██▒░██▒░░░░░██▒░██████▒░░░░░██████▒░░░░███▒░░░██████▒░██▒░░██▒░░
                ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                ░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░
                ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                ░▓▓▓▓▓▓▓░░░█████▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓░░██▒░░░░░██▒░▓▓▓▓▓▓▓▓▓▓▓▓▓░░██▒░░░░░▓▓▓▓▓▓▓▓▓▓░
                ░░░░░░▓▓░░██▒░░░░░░▓▓░░░░░░░░░▓▓░░██▒░░░░░██▒░▓▓░░░░░░░░░▓▓░░██▒░░░░░▓▓░░░░░░░░░
                ░░░░░░▓▓░░██▒░███▒░▓▓░░░░░░░░░▓▓░░██▒░██▒░██▒░▓▓░░░░░░░░░▓▓░░██▒░░░░░▓▓░░░░░░░░░
                ░░░░░░▓▓░░██▒░░██▒░▓▓░░░░░░░░░▓▓░░░████████▒░░▓▓░░░░░░░░░▓▓░░██▒░░░░░▓▓░░░░░░░░░
                ░▓▓▓▓▓▓▓░░░█████▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░██▒░██▒░░░▓▓▓▓▓▓▓▓▓▓▓▓▓░░██████▒░▓▓▓▓▓▓▓▓▓▓░
                ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░""";
    }

    protected String[] numbersTexture(int number) {
        String[] sNumber = new String[0];
        switch (number) {
            case 0 ->
                    sNumber = new String[]{"░░█████▒░", "░██▒░░██▒", "░██▒░░██▒", "░██▒░░██▒", "░░█████▒░", "░░░░░░░░░"};
            case 1 ->
                    sNumber = new String[]{"░░░██▒░░░", "░░███▒░░░", "░░░██▒░░░", "░░░██▒░░░", "░██████▒░", "░░░░░░░░░"};
            case 2 ->
                    sNumber = new String[]{"░░█████▒░", "░██▒░░██▒", "░░░░██▒░░", "░░██▒░░░░", "░███████▒", "░░░░░░░░░"};
            case 3 ->
                    sNumber = new String[]{"░░█████▒░", "░░░░░░██▒", "░░░████▒░", "░░░░░░██▒", "░░█████▒░", "░░░░░░░░░"};
            case 4 ->
                    sNumber = new String[]{"░░░░████▒", "░░░██▒██▒", "░░██▒░██▒", "░███████▒", "░░░░░░██▒", "░░░░░░░░░"};
            case 5 ->
                    sNumber = new String[]{"░░██████▒", "░██▒░░░░░", "░██████▒░", "░░░░░░██▒", "░██████▒░", "░░░░░░░░░"};
            case 6 ->
                    sNumber = new String[]{"░░█████▒░", "░██▒░░░░░", "░██████▒░", "░██▒░░██▒", "░░█████▒░", "░░░░░░░░░"};
            case 7 ->
                    sNumber = new String[]{"░███████▒", "░░░░░██▒░", "░░░░██▒░░", "░░░██▒░░░", "░░██▒░░░░", "░░░░░░░░░"};
            case 8 ->
                    sNumber = new String[]{"░░█████▒░", "░██▒░░██▒", "░░█████▒░", "░██▒░░██▒", "░░█████▒░", "░░░░░░░░░"};
            case 9 ->
                    sNumber = new String[]{"░░█████▒░", "░██▒░░██▒", "░░██████▒", "░░░░░░██▒", "░░█████▒░", "░░░░░░░░░"};
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
        return sNumber;
    }
}