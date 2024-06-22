package lc_4_median_of_sorted_arrays;

import java.util.HashMap;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return findMedian(nums2);
        } else if (nums2.length == 0) {
            return findMedian(nums1);
        }

        int mergedSize = nums1.length + nums2.length;
        int lowNums1 = 0;
        int highNums1 = nums1.length - 1;

        int cut1 = Integer.MIN_VALUE;
        int cut2 = Integer.MIN_VALUE;

        while (lowNums1 <= highNums1) {
            cut1 = lowNums1 + (highNums1 - lowNums1) / 2;
            int cut2Size = (mergedSize / 2) - (cut1 + 1);
            if (cut2Size < 0) {
                highNums1 = cut1 - 1;
                continue;
            } else if (cut2Size > nums2.length) {
                lowNums1 = cut1 + 1;
                continue;
            } else {
                cut2 = cut2Size - 1;
            }

            final HashMap<String, Integer> cutValues = getCutValues(nums1, nums2, cut1, cut2);
            if (cutValues.get("l1") > cutValues.get("r2")) {
                highNums1 = cut1 - 1;
                if (highNums1 < lowNums1) {
                    cut1 = -1;
                    cut2 = (mergedSize / 2) - 1;
                }
            }
            else if (cutValues.get("l2") > cutValues.get("r1"))
                lowNums1 = cut1 + 1;
            else
                break;
        }

        final HashMap<String, Integer> map = getCutValues(nums1, nums2, cut1, cut2);

        if (mergedSize % 2 == 0) {
            int left = Math.max(map.get("l1"), map.get("l2"));
            int right = Math.min(map.get("r1"), map.get("r2"));
            return (left + right) / 2.0;
        } else {
            return Math.min(map.get("r1"), map.get("r2"));
        }
    }

    private HashMap<String, Integer> getCutValues(int[] nums1, int[] nums2, int cut1, int cut2) {
        final HashMap<String, Integer> cuts = new HashMap<>();

        cuts.put("l1", getLeft(nums1, cut1));
        cuts.put("l2", getLeft(nums2, cut2));
        cuts.put("r1", getRight(nums1, cut1));
        cuts.put("r2", getRight(nums2, cut2));

        return cuts;
    }

    private int getLeft(int[] nums, int cut) {
        return (cut < 0) ? Integer.MIN_VALUE : nums[cut];
    }

    private int getRight(int[] nums, int cut) {
        return  (cut == nums.length - 1) ? Integer.MAX_VALUE : nums[cut + 1];
    }

    private double findMedian(int[] nums) {
        int mid = (nums.length - 1) / 2;
        return (nums.length % 2 == 0) ? (nums[mid] + nums[mid + 1]) / 2.0 : nums[mid];
    }
}
