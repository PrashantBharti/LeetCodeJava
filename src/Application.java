import lc_3_longest_substring_without_repeating_characters.Solution;

class Application {
    public static void main(String[] args) {
        Solution solution = new Solution();

        final String input = "abba";
        int ans = solution.lengthOfLongestSubstring(input);
        System.out.println(ans);
    }
}
