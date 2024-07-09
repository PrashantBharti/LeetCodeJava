package lc_30_substring_with_concatenation_of_all_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || words == null || words.length == 0)
            return res;

        int wordLen = words[0].length();
        int winLen = words.length * wordLen;
        if (s.length() < winLen)
            return res;

        Map<String, Integer> map = new HashMap<>();
        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        Map<String, Integer> mapTemp = new HashMap<>();
        Map<String, Boolean> seenStrings = new HashMap<>();
        for (int idx = 0; idx <= s.length() - winLen; idx++) {
            String sWin = s.substring(idx, idx + winLen);
            if (seenStrings.containsKey(sWin)) {
                if (seenStrings.get(sWin))
                    res.add(idx);

                continue;
            }

            mapTemp.clear();
            boolean matched = true;
            for (int i = idx; i < idx + winLen; i = i + wordLen) {
                String sWord = s.substring(i, i + wordLen);
                mapTemp.put(sWord, mapTemp.getOrDefault(sWord, 0) + 1);
                if (mapTemp.get(sWord) > map.getOrDefault(sWord, 0)) {
                    matched = false;
                    break;
                }
            }

            seenStrings.put(sWin, matched);
            if (matched) {
                res.add(idx);
            }
        }

        return res;
    }
}
