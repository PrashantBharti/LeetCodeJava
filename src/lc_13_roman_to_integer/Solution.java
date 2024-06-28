package lc_13_roman_to_integer;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer n1 = map.get(s.charAt(i));
            Integer n2 = (i + 1) < s.length() ? map.get(s.charAt(i + 1)) : null;

            if (n2 == null || n1 >= n2) {
                res += n1;
            } else if (n2 != null && n1 < n2) {
                res += (n2 - n1);
                i++;
            }
        }

        return res;
    }
}