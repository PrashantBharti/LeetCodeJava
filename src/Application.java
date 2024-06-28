import lc_12_integer_to_roman.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int num = 20;
        String ans = solution.intToRoman(num);
        System.out.println(ans);
    }
}
