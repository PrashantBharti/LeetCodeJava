package lc_27_remove_element;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[++idx] = nums[i];
        }

        return ++idx;
    }
}
