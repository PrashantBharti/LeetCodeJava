package lc_16_3_sum_closest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;

        int sum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int curSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(curSum - target) < Math.abs(sum - target))
                    sum = curSum;

                if (curSum > target)
                    right--;
                else if (curSum < target)
                    left++;
                else
                    return sum;
            }
        }

        return sum;
    }
}
