package lc_31_next_permutation;

import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2)
            return;

        int idxToUpgrade = nums.length - 2;
        while (idxToUpgrade >= 0 && nums[idxToUpgrade] >= nums[idxToUpgrade + 1])
            idxToUpgrade--;

        if (idxToUpgrade < 0 || nums[idxToUpgrade] >= nums[idxToUpgrade + 1]) {
            Arrays.sort(nums);
            return;
        }

        int idxMaxToSwap = nums.length - 1;
        while (idxMaxToSwap > idxToUpgrade && nums[idxMaxToSwap] <= nums[idxToUpgrade])
            idxMaxToSwap--;

        int temp = nums[idxToUpgrade];
        nums[idxToUpgrade] = nums[idxMaxToSwap];
        nums[idxMaxToSwap] = temp;

        Arrays.sort(nums, idxToUpgrade +1, nums.length);
    }
}
