package ru.job4j.array;

public class IsWin {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] == 'X') {
                if (MatrixCheck.monoHorizontal(board, i) || MatrixCheck.monoVertical(board, i)) {
                    result = true;
                }
            }
        }
        return result;
    }
}