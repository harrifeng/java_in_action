package oj.leet.ri;

public class Solution {

    public int reverse(int x) {
        boolean neg = false;
        if (x < 0) {
            neg = true;
        }
        //Integer.MIN_VALUE can not have corresponding abs value
        if (x == Integer.MIN_VALUE) {
            return x;
        }
        x = Math.abs(x);
        int ret = 0;
        while (x != 0) {
            if (ret > Integer.MAX_VALUE / 10
                    || (ret == Integer.MAX_VALUE / 10
                    && x % 10 > Integer.MAX_VALUE % 10)) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        if (neg) {
            return ret * (-1);
        }
        return ret;
    }

    public int reverseSimple(int x) {
        int ret = 0;
        while (x != 0) {
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        return ret;
    }
}

