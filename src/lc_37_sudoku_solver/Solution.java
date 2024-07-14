package lc_37_sudoku_solver;

import java.util.HashSet;

public class Solution {
    private HashSet<Character> set = new HashSet<>();

    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0)
            return;

        solve(board);
    }

    private boolean solve(char[][] board) {
        int row = -1;
        int col = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.')
                    continue;

                row = i;
                col = j;
                break;
            }

            if (row != -1 && col != -1)
                break;
        }

        if (row == -1 || col == -1)
            return true;

        for (int k = 1; k < 10; k++) {
            board[row][col] = Character.forDigit(k, 10);

            if (!isRowValid(board, row, col) || !isColValid(board, row, col) || !isBoxValid(board, row, col))
                continue;

            boolean res = solve(board);
            if (res)
                return true;
        }

        board[row][col] = '.';
        return false;
    }

    private boolean isRowValid(char[][] board, int r, int c) {
        set.clear();
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == '.')
                continue;

            if (set.contains(board[r][i]))
                return false;

            set.add(board[r][i]);
        }

        return true;
    }

    private boolean isColValid(char[][] board, int r, int c) {
        set.clear();
        for (int i = 0; i < 9; i++) {
            if (board[i][c] == '.')
                continue;

            if (set.contains(board[i][c]))
                return false;

            set.add(board[i][c]);
        }

        return true;
    }

    private boolean isBoxValid(char[][] board, int r, int c) {
        set.clear();
        int row = 3 * (r / 3);
        int col = 3 * (c / 3);
        for (int i = row; i < (row + 3); i++) {
            for (int j = col; j < (col + 3); j++) {
                if (board[i][j] == '.')
                    continue;

                if (set.contains(board[i][j]))
                    return false;

                set.add(board[i][j]);
            }
        }

        return true;
    }
}
