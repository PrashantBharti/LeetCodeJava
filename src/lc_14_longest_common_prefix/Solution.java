package lc_14_longest_common_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int idx = 0;
        boolean flag = true;

        while (flag) {
            Character ch = null;
            for (final String str : strs) {
                if (str.isEmpty() || str.length() <= idx) {
                    flag = false;
                    break;
                }

                if (ch == null)
                    ch = str.charAt(idx);
                else if (ch != str.charAt(idx)) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                idx += 1;
        }

        return (idx <= 0) ? "" : strs[0].substring(0, idx);
    }
}
