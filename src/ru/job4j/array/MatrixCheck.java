package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[0].length ; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int columb) {
        boolean result = true;
        for (int i = 0; i < board[0].length ; i++) {
            if (board[i][columb] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        char[][] input = {
                {' ', ' ', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', 'X'},
        };
        int columb = 2;
        boolean result = MatrixCheck.monoVertical(input, columb);
        System.out.println(result);

    }
}
