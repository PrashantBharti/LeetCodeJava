import lc_18_4_sum.Solution;

import java.util.List;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int[] nums = {1000000000,1000000000, 1000000000, 1000000000};
        int target = -294967296;

        List<List<Integer>> res = solution.fourSum(nums, target);
        System.out.println(res);
    }
}
