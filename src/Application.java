import lc_5_longest_palindromic_substring.Solution;

class Application {
    public static void main(String[] args) {
        final String input = "abrbadaadab";

        final Solution solution = new Solution();

        final String lps = solution.longestPalindrome(input);
        System.out.println(lps);
    }
}
