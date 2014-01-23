package oj.leet.itr;

import java.util.Arrays;

/**
 * Created by hfeng on 14-1-16.
 */
public class Solution {
    //num is suppose to be 1 to 3999
    private String romeN = "IVXLCDM";

    public String intToRoman(int num) {
        StringBuffer sb = new StringBuffer("");
        int size = 1000;
        int[] digits = new int[4];
        int i = 0;
        while (num != 0) {
            digits[i] = num / size;
            num %= size;
            size /= 10;
            i++;
        }

        for (int j = 0; j < digits.length; j++) {
            if (digits[j] > 0) {
                sb.append(dToR(digits[j], 3-j));
            }
        }

        return sb.toString();
    }

    private String dToR(int i, int lev) {
        if (i > 9 || i < 1) {
            return "";
        }
        StringBuffer sbuf = new StringBuffer("");
        if (i < 4) {
            while (i > 0) {
                sbuf.append(romeN.charAt(lev * 2));
                i--;
            }
            return sbuf.toString();
        } else if (i == 4) {
            sbuf.append(romeN.charAt(lev * 2));
            sbuf.append(romeN.charAt(lev * 2 + 1));
            return sbuf.toString();
        } else if (i > 4 && i <= 8) {
            sbuf.append(romeN.charAt(lev * 2 + 1));
            while (i > 5) {
                sbuf.append(romeN.charAt(lev * 2));
                i--;
            }
            return sbuf.toString();
        } else if (i == 9) {
            sbuf.append(romeN.charAt(lev * 2 ));
            sbuf.append(romeN.charAt(lev * 2 + 2));
            return sbuf.toString();
        }
        return sbuf.toString();
    }
}
