import lc_33_search_in_rotated_sorted_array.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        //            0  1  2
        int[] nums = {2, 3, -2};
        int target = 0;

        int res = solution.search(nums, target);
        System.out.println(res);
    }
}
