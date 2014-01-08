package oj.leet.pn;

/**
 * Created by hfeng on 14-1-8.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return  false;
        }
        int num = x;
        int times = 1;
        // 10 is very easily to be ignored, it is 2-digit number
        while (x >= 10) {
            times *= 10;
            x = x / 10;
        }

        while (num >= 10) {
            int front = num / times;
            int back = num % 10;
            if (front != back) {
                return false;
            }
            num = num / 10 - front * times;
            times = num / 100;
        }

        return true;
    }
}
