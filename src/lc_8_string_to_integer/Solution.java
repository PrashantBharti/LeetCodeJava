package lc_8_string_to_integer;

public class Solution {
    public int myAtoi(String s) {
        Long res = null;
        Boolean neg = null;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                if (res == null)
                    res = 0L;

                res = res * 10 + (c - '0');

                if (res > Integer.MAX_VALUE) {
                    if (neg != null && neg) {
                        Integer temp = Integer.MAX_VALUE;
                        res = temp.longValue() + 1;
                    } else {
                        Integer temp = Integer.MAX_VALUE;
                        res = temp.longValue();
                    }

                    break;
                }
            } else {
                if (res != null)
                    break;

                if (c == '-' || c == '+') {
                    if (neg != null)
                        break;

                    neg = (c == '-');
                    res = 0L;
                    continue;
                }

                if (!Character.isWhitespace(c))
                    break;
            }
        }

        int int_res = 0;
        if (res != null) {
            res = (neg != null && neg) ? -res : res;
            int_res = res.intValue();
        }

        return int_res;
    }
}
