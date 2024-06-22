import lc_4_median_of_sorted_arrays.Solution;

class Application {
    public static void main(String[] args) {
        int[] nums1 = {3};
        int[] nums2 = {-2, -1};

        Solution solution = new Solution();

        double ans = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(ans);
    }
}
