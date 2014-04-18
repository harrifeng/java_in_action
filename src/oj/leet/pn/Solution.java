package oj.leet.pn;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int numLen = 1;
        int tmp = x;
        while (tmp >= 10) {
            numLen *= 10;
            tmp /= 10;
        }

        // We should not use x >= 10 as the condition
        // Consider 100091, it will reach x = 9 and leave
        // the loop without returning false.
        while (x != 0) {
            int beg = x / numLen;
            int end = x % 10;
            if (beg != end) {
                return false;
            }
            x = x % numLen / 10;
            numLen = numLen / 100;
        }
        return true;
    }
}
