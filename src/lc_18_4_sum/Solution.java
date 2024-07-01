package lc_18_4_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null)
            return res;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i];
                    try {
                        sum = Math.addExact(sum, nums[j]);
                        sum = Math.addExact(sum, nums[left]);
                        sum = Math.addExact(sum, nums[right]);
                    } catch (final Exception e) {
                        left += 1;
                        continue;
                    }

                    if (sum < target)
                        left += 1;
                    else if (sum > target)
                        right -= 1;
                    else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);

                        while (left < right && nums[left] == nums[left + 1])
                            left += 1;

                        while (left < right && nums[right] == nums[right - 1])
                            right -= 1;

                        left += 1;
                        right -= 1;
                    }
                }
            }
        }

        return res;
    }
}
