package lc_36_valid_sudoku;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0)
            return false;

        HashMap<String, HashSet<String>> map = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.')
                    continue;

                String num = String.valueOf(board[i][j]);
                String boardKeyRow = getRow(i, j);
                String boardKeyCol = getCol(i, j);
                String boardKeyBox = getBox(i, j);
                HashSet<String> set = null;

                if (map.containsKey(num)) {
                    set = map.get(num);
                    if (set.contains(boardKeyRow) || set.contains(boardKeyCol) || set.contains(boardKeyBox))
                        return false;
                } else
                    set = new HashSet<>();

                set.add(boardKeyRow);
                set.add(boardKeyCol);
                set.add(boardKeyBox);
                map.put(num, set);
            }
        }

        return true;
    }

    private String getRow(int i, int j) {
        return "R" + i;
    }

    private String getCol(int i, int j) {
        return "C" + j;
    }

    private String getBox(int i, int j) {
        if (i >= 6 && j >= 6)
            return "B" + 8;
        else if (i >= 6 && j >= 3)
            return "B" + 7;
        else if (i >= 6 && j >= 0)
            return "B" + 6;
        else if (i >= 3 && j >= 6)
            return "B" + 5;
        else if (i >= 3 && j >= 3)
            return "B" + 4;
        else if (i >= 3 && j >= 0)
            return "B" + 3;
        else if (i >= 0 && j >= 6)
            return "B" + 2;
        else if (i >= 0 && j >= 3)
            return "B" + 1;
        else
            return "B" + 0;
    }
}
