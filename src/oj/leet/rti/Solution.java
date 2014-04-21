package oj.leet.rti;

public class Solution {

    public int romanToInt(String s) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && cToInt(s.charAt(i)) > cToInt(s.charAt(i - 1))) {
                ret = ret + cToInt(s.charAt(i)) - 2 * cToInt(s.charAt(i - 1));
            } else {
                ret += cToInt(s.charAt(i));
            }
        }
        return ret;
    }

    private int cToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
