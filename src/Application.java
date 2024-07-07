import lc_27_remove_element.Solution;

import java.util.Arrays;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int[] nums = {0,1,2,2,3,0,4,2};
        int k = solution.removeElement(nums, 2);
        System.out.println(Arrays.toString(nums) + ", k = " + k);
    }
}
