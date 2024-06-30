package lc_17_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Solution {
    private Map<Character, String> map = new HashMap<>();

    public Solution() {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> letterCombinations(final String digits) {
        if (Objects.isNull(digits) || digits.isEmpty())
            return new ArrayList<>();

        List<String> res = new ArrayList<>();
        return makeCombinations(digits, 0, res);
    }

    private List<String> makeCombinations(final String digits, int idx, List<String> combs) {
        if (idx < 0 || idx >= digits.length())
            return combs;

        final String options = map.get(digits.charAt(idx));
        final List<String> newCombs = new ArrayList<>();
        for (final Character ch : options.toCharArray()) {
            if (combs.isEmpty())
                newCombs.add(ch.toString());
            else {
                for (final String comb : combs)
                    newCombs.add(comb + ch);
            }
        }

        return makeCombinations(digits, idx + 1, newCombs);
    }
}
