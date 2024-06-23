package lc_6_zigzag_conversion;

import java.util.Arrays;
import java.util.Objects;

public class Solution {
    private Integer numRows = null;
    private Integer curRow = null;
    private Integer direction = null;

    public String convert(final String input, int numRows) {
        if (Objects.isNull(input) || numRows < 1)
            return "";

        initializeConfig(numRows);
        final StringBuilder[] grid = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            grid[i] = new StringBuilder();
        }

        for (final Character c : input.toCharArray()) {
            int rowIdx = getNextRowIndex();
            grid[rowIdx].append(c);
        }

        final StringBuilder sb = new StringBuilder();
        for (final StringBuilder row : grid) {
            sb.append(row.toString());
        }

        return sb.toString();
    }

    private void initializeConfig(int numRows_) {
        numRows = numRows_;
        curRow = -1;
        direction = 0;
    }

    private int getNextRowIndex() {
        if (numRows == 1)
            return 0;

        if (direction == 0) {
            curRow += 1;
            if (curRow == numRows - 1)
                direction = 1;
        } else {
            curRow -= 1;
            if (curRow == 0)
                direction = 0;
        }

        return curRow;
    }
}
