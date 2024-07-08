package lc_29_divide_two_integers;

public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign = ((dividend < 0) == (divisor < 0));

        long x = (long) (dividend);
        x = Math.abs(x);
        long y = (long) (divisor);
        y = Math.abs(y);
        long q = 0;

        while (x >= y) {
            int shift = 0;
            while (x >= (y << (shift + 1))) {
                shift += 1;
            }

            int tmp = (1 << shift);
            q += tmp;
            x -= (y << shift);
        }

        if (q == Integer.MAX_VALUE && sign)
            return Integer.MAX_VALUE;

        if (q == Integer.MIN_VALUE && !sign)
            return Integer.MIN_VALUE;

        return (int)(sign ? q : -q);
    }
}
