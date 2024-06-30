import lc_16_3_sum_closest.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int[] nums = {0, 0, 0};
        int target = 1;

        int ans = solution.threeSumClosest(nums, target);
        System.out.println(ans);
    }
}
