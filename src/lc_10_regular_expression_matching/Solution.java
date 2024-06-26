package lc_10_regular_expression_matching;

public class Solution {
    public boolean isMatch(String s, String p) {
        return isMatch(s, p, 0, 0);
    }

    private boolean isMatch(String s, String p, int i, int j) {
        if (i >= s.length() && j >= p.length())
            return true;

        if (j >= p.length())
            return false;

        boolean match = (i < s.length()) && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
        if ((j + 1) < p.length() && p.charAt(j + 1) == '*')
            return isMatch(s, p, i, j + 2) || (match && isMatch(s, p, i + 1, j));

        if (match)
            return isMatch(s, p, i + 1, j + 1);

        return false;
    }
}
