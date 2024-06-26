import lc_10_regular_expression_matching.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        String s = "aa";
        String p = "a*";
        boolean ans = solution.isMatch(s, p);
        System.out.println(ans);
    }
}
