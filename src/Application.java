import lc_28_index_of_first_occurrence.Solution;

import java.util.Arrays;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        String s1 = "sadbutsad";
        String s2 = "but";
        int i = solution.strStr(s1, s2);
        System.out.println(i);
    }
}
