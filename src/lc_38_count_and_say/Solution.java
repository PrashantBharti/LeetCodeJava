package lc_38_count_and_say;

public class Solution {
    public String countAndSay(int n) {
        if (n <= 0)
            return "";

        if (n == 1)
            return "1";

        String res = countAndSay(n - 1);

        int cur_count = 0;
        Character cur_char = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length(); i++) {
            Character temp_char = res.charAt(i);
            if (cur_char == null) {
                cur_char = temp_char;
                cur_count++;
            }else if (temp_char.equals(cur_char)) {
                cur_count++;
            } else {
                sb.append(String.valueOf(cur_count)).append(cur_char);
                cur_char = temp_char;
                cur_count = 1;
            }
        }

        sb.append(String.valueOf(cur_count)).append(cur_char);

        return sb.toString();
    }
}
