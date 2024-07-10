import lc_31_next_permutation.Solution;

import java.util.Arrays;
import java.util.List;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int[] nums = {0, 0};

        solution.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
