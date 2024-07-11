import lc_32_longest_valid_parentheses.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        String s = "((()))())((((()))))))";

        int res = solution.longestValidParentheses(s);
        System.out.println(res);
    }
}
