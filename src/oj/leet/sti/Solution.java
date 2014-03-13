package oj.leet.sti;

public class Solution {
    public int atoi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int start = 0;
        boolean negVal = false;
        int result = 0;
        while(str.charAt(start) == ' ') {
            start++;
        }
        if (str.charAt(start) == '-') {
            negVal = true;
            start++;
        } else if (str.charAt(start) == '+') {
            start++;
        }
        int len = str.length();
        for(int i = start; i < len; i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (result > Integer.MAX_VALUE / 10
                    || result == Integer.MAX_VALUE / 10
                    && Character.getNumericValue(str.charAt(i)) > Integer.MAX_VALUE % 10) {
                    return negVal ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + Character.getNumericValue(str.charAt(i));
            } else {
                break;
            }
        }
        return negVal ? result * -1 : result;
    }
}
