import lc_39_combination_sum.Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int[] candidates = {2, 3, 5};
        List<List<Integer>> res = solution.combinationSum(candidates, 4);
        for (List<Integer> list : res) {
            System.out.println(list);
        }
    }
}
