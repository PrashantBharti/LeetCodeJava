import lc_14_longest_common_prefix.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        final String[] strs = {"test", "testchd", "testa"};
        final String ans = solution.longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
