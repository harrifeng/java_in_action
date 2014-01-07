package oj.leet.ri;

/**
 * Created by hfeng on 14-1-7.
 */
public class Solution {
    public int reverse(int x) {

        boolean negNum = false;
        if (x < 0) {
            negNum = true;
        }

        ///////////////////////////////////////////////////////////////////////////////
        // Integer.MIN_VALUE is -2,147,483,648, and its abs should be                //
        // +2,147,483,648, however, when using signed integers, the two's complement //
        // binary of +2,147,483,648 and -2,147,483,648 are the same.                 //
        // As +2,147,483,648 is out of range, the -2,147,483,648 is shown            //
        ///////////////////////////////////////////////////////////////////////////////
        if (x == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        x = Math.abs(x);
        
        int result = 0;
        while (x > 0) {
            if (result > Integer.MAX_VALUE /10
                || result == Integer.MAX_VALUE / 10
                && x / 10 > Integer.MAX_VALUE % 10) {
               if (negNum) {
                   return Integer.MIN_VALUE;
               } else {
                   return Integer.MAX_VALUE;
               }
            }
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (negNum) {
            return result * -1;
        }
        return result;
    }


    //Following version reverse can not handle overlap
    public int reverseSimple(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return result;
    }

}
