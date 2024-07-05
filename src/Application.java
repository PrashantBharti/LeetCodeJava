import lc_22_generate_parentheses.Solution;

import java.util.List;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        List<String> res = solution.generateParenthesis(3);
        System.out.println(res);
    }
}
