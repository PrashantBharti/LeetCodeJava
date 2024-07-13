package lc_34_search_first_last_position_in_sorted_array;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1, -1};
        if (nums == null || nums.length == 0)
            return res;

        res[0] = getStartPosition(nums, target, 0, nums.length - 1);
        res[1] = getEndPosition(nums, target, 0, nums.length - 1);

        return res;
    }

    private int getStartPosition(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            if (mid > 0) {
                if (nums[mid - 1] < target) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            } else {
                return mid;
            }
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }

        return getStartPosition(nums, target, start, end);
    }

    private int getEndPosition(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            if (mid < nums.length - 1) {
                if (nums[mid + 1] > target) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            } else {
                return mid;
            }
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }

        return getEndPosition(nums, target, start, end);
    }
}
