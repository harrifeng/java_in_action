package oj.leet.sti;

import sun.rmi.server.InactiveGroupException;

/**
 * Created by hfeng on 14-1-7.
 */
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
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                if (result > Integer.MAX_VALUE / 10
                    || result == Integer.MAX_VALUE / 10
                    && str.charAt(i) - '0' > Integer.MAX_VALUE % 10) {
                    return negVal ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + (str.charAt(i) - '0');
            } else {
                break;
            }
        }

        return negVal ? result * -1 : result;
    }
}
