package oj.leet.rti;

/**
 * Created by hfeng on 14-1-22.
 */
public class Solution {
    private int cton(char c) {
        switch(c) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (cton(s.charAt(i)) > cton(s.charAt(i-1)))) {
                ret += cton(s.charAt(i))  - 2 * cton(s.charAt(i-1));
            } else {
                ret += cton(s.charAt(i));
            }
        }
        return ret;
    }
}
