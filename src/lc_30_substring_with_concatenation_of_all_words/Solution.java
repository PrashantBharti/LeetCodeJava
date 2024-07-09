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

        // offset can be from 0 to wordlen
        for (int offset = 0; offset < wordLen; offset++) {
            // substrings can be from 0 to s - winlen
            for (int idx = offset; idx <= s.length() - winLen; idx = idx + wordLen) {
                Map<String, Integer> mapCopy = new HashMap<>(map);
                boolean exist = true;
                // check all words in s
                for (int i = idx; i < idx + winLen; i = i + wordLen) {
                    // i to i + wordLen - 1
                    String sWord = s.substring(i, i + wordLen);
                    if (mapCopy.getOrDefault(sWord, 0) > 0)
                        mapCopy.put(sWord, mapCopy.get(sWord) - 1);
                    else {
                        exist = false;
                        break;
                    }
                }

                if (exist)
                    res.add(idx);
            }
        }

        return res;
    }
}
