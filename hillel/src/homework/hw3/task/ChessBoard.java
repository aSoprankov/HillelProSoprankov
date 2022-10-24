package homework.hw3.task;

public abstract class ChessBoard {
    public static void printChessBoard() {
        int size = 8;
        char[][] chessBoard = new char[size][size];

        char white = 'W';
        char black = 'B';

        System.out.println("\nTASK 13. Display an 8x8 chessboard as a 2-dimensional array.");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] =
                        ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) ? black : white;
            }
        }

        for (char[] chars : chessBoard) {
            for (char _char : chars) {
                System.out.print(_char + "  ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
