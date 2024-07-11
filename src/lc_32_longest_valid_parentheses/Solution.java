package lc_32_longest_valid_parentheses;

import java.util.Objects;

public class Solution {
    public int longestValidParentheses(String s) {
        if (Objects.isNull(s) || s.isEmpty())
            return 0;

        int max = 0;
        int substring_start = -1;
        int open = 0;
        int close = 0;
        for (int j = 0; j < s.length(); j++) {
            if (substring_start == -1)
                substring_start = j;

            if (s.charAt(j) == '(')
                open++;
            else
                close++;

            if (open == close)
                max = Math.max(max, 2*open);
            else if (close > open) {
                open = 0;
                close = 0;
                substring_start = -1;
            }
        }

        if (open == close)
            return max;

        open = 0;
        close = 0;
        for (int j = s.length() - 1; j >= substring_start; j--) {
            if (s.charAt(j) == '(')
                open++;
            else
                close++;

            if (open == close)
                max = Math.max(max, 2*open);
            else if (open > close) {
                open = 0;
                close = 0;
            }
        }

        return max;
    }
}
