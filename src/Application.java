import lc_1_twosum.Solution;

import java.util.Arrays;

class Application {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        final Solution solution = new Solution();
        int[] sumPair = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(sumPair));
    }
}
