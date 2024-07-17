package lc_39_combination_sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 2)
            return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] > target)
                continue;

            int temp = target - candidates[i];
            if (temp == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(candidates[i]);
                if (!res.contains(list))
                    res.add(list);
            } else {
                List<List<Integer>> tempRes = combinationSum(candidates, temp);
                for (List<Integer> tempList : tempRes) {
                    List<Integer> list = new ArrayList<>(tempList);
                    list.add(candidates[i]);
                    Collections.sort(list);
                    if (!res.contains(list))
                        res.add(list);
                }
            }
        }

        return res;
    }
}
