import lc_26_remove_duplicates_from_sorted_array.Solution;

import java.util.Arrays;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int[] nums = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7};
        int k = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums) + " k =" + k);
    }
}
