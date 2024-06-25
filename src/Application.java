import lc_8_string_to_integer.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        final String input = "-91283472332";
        int ans = solution.myAtoi(input);
        System.out.println(ans);
    }
}
