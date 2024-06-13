package lc_3_longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;
import static java.util.Objects.isNull;

public class Solution {
    public int lengthOfLongestSubstring(final String input) {
        if (isNull(input) || input.isEmpty())
            return 0;

        final Map<Character, Integer> map = new HashMap<>();
        int idxStart = 0;
        map.put(input.charAt(idxStart), idxStart);

        int max = 1;
        for (int idxEnd = 1; idxEnd < input.length(); idxEnd++) {
            char c = input.charAt(idxEnd);
            if (map.containsKey(c)) {
                int idx = map.get(c);
                map.remove(c);
                idxStart = Math.max(idxStart, idx + 1);
            }

            map.put(c, idxEnd);
            max = Math.max(max, idxEnd - idxStart + 1);
        }

        return max;
    }
}
