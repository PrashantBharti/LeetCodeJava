package lc_22_generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int nbOpen = 0;
    private int nbClose = 0;
    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 0)
            return res;

        nbOpen = n;
        nbClose = n;

        StringBuilder sb = new StringBuilder();
        generateParenthesisHelper(sb);

        return res;
    }

    private void generateParenthesisHelper(StringBuilder sb) {
        if (nbOpen == 0 && nbClose == 0) {
            res.add(sb.toString());
            return;
        }

        if (sb.length() <= 0) {
            sb.append('(');
            nbOpen--;
            generateParenthesisHelper(sb);
            return;
        }

        if (nbOpen > 0) {
            sb.append('(');
            nbOpen--;
            generateParenthesisHelper(sb);
            nbOpen++;
            sb.deleteCharAt(sb.length() - 1);
        }

        if (nbClose - 1 < nbOpen)
            return;

        nbClose--;
        sb.append(')');
        generateParenthesisHelper(sb);
        sb.deleteCharAt(sb.length() - 1);
        nbClose++;
    }
}
