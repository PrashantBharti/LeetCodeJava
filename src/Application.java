import lc_20_valid_parentheses.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        String s = "[(){}]";

        boolean res = solution.isValid(s);
        System.out.println(res);
    }
}
