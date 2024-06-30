import lc_15_3_sum.Solution;

import java.util.List;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int[] nums = {-1,0,1,2,-1,-4};
        final List<List<Integer>> ans = solution.threeSum(nums);
        System.out.println(ans);
    }
}
