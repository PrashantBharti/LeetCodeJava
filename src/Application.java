import lc_35_search_insert_position.Solution;

import java.util.Arrays;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        //            0  1  2  3
        int[] nums = {1, 3, 5, 10};
        int target = 11;

        int res = solution.searchInsert(nums, target);
        System.out.println(res);
    }
}
