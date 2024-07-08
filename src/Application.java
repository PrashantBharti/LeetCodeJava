import lc_29_divide_two_integers.Solution;

import java.util.Arrays;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int q = solution.divide(-2147483648, -1);
        System.out.println(q);
    }
}
