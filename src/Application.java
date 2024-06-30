import lc_17_letter_combinations_of_a_phone_number.Solution;

import java.util.List;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        final String digits = "999";

        List<String> combs = solution.letterCombinations(digits);
        System.out.println(combs);
        System.out.println(combs.size());
    }
}
