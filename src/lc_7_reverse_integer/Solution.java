package lc_7_reverse_integer;

public class Solution {
    private String refString = String.valueOf(Integer.MIN_VALUE);
    private int curRefDigitIdx = 0;
    private Boolean checkNext = true;
    private Boolean cmpResult = true;
    private Boolean isPos = true;

    public int reverse(int x) {
        if (x == 0)
            return 0;

        final Boolean isPositive = (x > 0) ? true : false;
        x = Math.abs(x);

        setRef(isPositive);
        String xStr = String.valueOf(x);
        int curXStrIdx = xStr.length() - 1;

        int result = 0;
        while (curXStrIdx > -1) {
            if (!canReverse(curXStrIdx, xStr))
                return 0;

            int nextDigit = xStr.charAt(curXStrIdx) - '0';
            curXStrIdx--;

            result = result * 10 + nextDigit;
        }

        return isPositive ? result : -1 * result;
    }

    private void setRef(Boolean isPositive) {
        isPos = isPositive;
        if (isPos) {
            refString = String.valueOf(Integer.MAX_VALUE);
            curRefDigitIdx = 0;
        }
        else {
            refString = String.valueOf(Math.abs(Integer.MIN_VALUE));
            curRefDigitIdx = 1;
        }
    }

    private Boolean canReverse(int curXStrIdx, final String xStr) {
        if (xStr.length() < (refString.length() + (isPos ? 0 : -1)))
            return true;

        if (xStr.length() > refString.length())
            return false;

        if (!checkNext)
            return cmpResult;

        int nextDigit = xStr.charAt(curXStrIdx) - '0';
        int refDigit = refString.charAt(curRefDigitIdx) - '0';
        curRefDigitIdx++;

        if (nextDigit < refDigit) {
            checkNext = false;
            cmpResult = true;
        } else if (nextDigit > refDigit) {
            checkNext = false;
            cmpResult = false;
        } else
            cmpResult = true;

        return cmpResult;
    }
}
