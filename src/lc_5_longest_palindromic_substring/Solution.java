package lc_5_longest_palindromic_substring;

import java.util.Objects;

public class Solution {
    public String longestPalindrome(final String input) {
        if (Objects.isNull(input) || input.isBlank())
            throw new IllegalArgumentException("Invalid input");

        String lps = "";
        Integer lpsLength = 0;

        for (int i = 0; i < input.length(); i++) {
            final String oddLps = longestOddPalindrome(input, i);
            if (oddLps.length() > lpsLength) {
                lpsLength = oddLps.length();
                lps = oddLps;
            }

            final String evenLps = longestEvenPalindrome(input, i);
            if (evenLps.length() > lpsLength) {
                lpsLength = evenLps.length();
                lps = evenLps;
            }
        }

        return lps;
    }

    private String longestOddPalindrome(final String input, final Integer idx) {
        final Integer left = idx;
        final Integer right = idx;

        return longestPalindrome(input, left, right);
    }

    private String longestEvenPalindrome(final String input, final Integer idx) {
        final Integer left = idx;
        final Integer right = idx + 1;

        return longestPalindrome(input, left, right);
    }

    private String longestPalindrome(final String input, Integer left, Integer right) {
        String lps = "";
        Integer lpsLength = 0;

        while (left >= 0 && right < input.length() && (input.charAt(left) == input.charAt(right))) {
            String pl = input.substring(left, right + 1);
            if (pl.length() > lpsLength) {
                lps = pl;
                lpsLength = pl.length();
            }

            left = left - 1;
            right = right + 1;
        }

        return lps;
    }
}
