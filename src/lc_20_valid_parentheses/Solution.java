package lc_20_valid_parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty())
            return true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty())
                    return false;

                if (c == ')' && stack.peek() != '(')
                    return false;
                else if (c == '}' && stack.peek() != '{')
                    return false;
                else if (c == ']' && stack.peek() != '[')
                    return false;

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
