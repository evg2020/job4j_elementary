package ru.job4j.array;
/**
 * @author Fedorenko
 * @param board-ввод поля со сзначениями
 * @return result-возвращает правда-ложь есть ли вертикальные или горизонтальные линии из Х
 *
 *
 *
 */

public class IsWin {
    public static boolean isWin(char [][] board) {
        boolean result = false;
        for (int i = 0; i <board.length ; i++) {
            if (board[i][i] == 'X') {
                if (MatrixCheck.monoHorizontal(board, i) || MatrixCheck.monoVertical(board, i)) {
                    result = true;
                }
            }
        }
        return result;
    }
   }
