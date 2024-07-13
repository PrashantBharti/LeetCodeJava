import lc_34_search_first_last_position_in_sorted_array.Solution;

import java.util.Arrays;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        //            0  1  2  3  4  5   6
        int[] nums = {-1, 3};
        int target = 0;

        int[] res = solution.searchRange(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
