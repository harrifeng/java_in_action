package oj.leet.pn;

/**
 * Created by hfeng on 14-1-8.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return  false;
        }

        int times = 1;
        int tmp = x;
        // 10 is very easily to be ignored, it is 2-digit number
        while (tmp >= 10) {
            times *= 10;
            tmp = tmp / 10;
        }

        while (x >= 10) {
            int beg = x / times;
            int end = x % 10;
            if (beg != end) {
                return false;
            }
            x = x % times / 10;
            times = times / 100;
        }

        return true;
    }
}
