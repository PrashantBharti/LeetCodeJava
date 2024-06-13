package lc_3_longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.util.Objects.isNull;

public class Solution {
    public int lengthOfLongestSubstring(final String input) {
        if (Objects.isNull(input) || input.isEmpty())
            return 0;

        final Map<Character, Integer> map = new HashMap<>();
        int idxStart = 0;
        map.put(input.charAt(idxStart), idxStart);

        int max = 1;
        int idxEnd = 1;
        while (idxEnd < input.length()) {
            char c = input.charAt(idxEnd);
            if (map.containsKey(c)) {
                int idx = map.get(c);
                if (idx < idxStart) {
                    map.remove(c);
                } else {
                    idxStart = idx + 1;
                }
            }

            map.put(c, idxEnd);

            max = Math.max(max, idxEnd - idxStart + 1);
            idxEnd++;
        }

        return max;
    }
}
