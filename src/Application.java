import lc_9_palindrome_number.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int input = 1231;
        boolean ans = solution.isPalindrome(input);
        System.out.println(ans);
    }
}
