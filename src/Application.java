import lc_13_roman_to_integer.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        String s = "XCV";
        int ans = solution.romanToInt(s);
        System.out.println(ans);
    }
}
