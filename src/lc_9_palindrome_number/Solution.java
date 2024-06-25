package lc_9_palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x == 0)
            return true;

        int temp = x;
        int y = 0;
        while (temp != 0) {
            y = y * 10 + temp % 10;
            temp /= 10;
        }

        return x == y;
    }
}
