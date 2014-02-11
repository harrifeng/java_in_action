package oj.leet.vp;

import java.util.Stack;

/**
 * Created by hfeng on 14-2-11.
 */
public class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (current == ')') {
                if (stack.empty() || stack.pop() != '(') {
                    return false;
                }
            } else if (current == ']') {
                if (stack.empty() || stack.pop() != '[') {
                    return false;
                }
            } else if (current == '}') {
                if (stack.empty() || stack.pop() != '{') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}