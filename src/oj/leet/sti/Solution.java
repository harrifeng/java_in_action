package oj.leet.sti;
public class Solution {

    public int atoi(String str) {
        if (str.length() == 0) {
            return 0;
        }

        int beg = 0;
        while (str.charAt(beg) == ' ') {
            beg++;
        }

        boolean neg = false;
        if (str.charAt(beg) == '+') {
            beg++;
        } else if (str.charAt(beg) == '-') {
            beg++;
            neg = true;
        }

        int ret = 0;
        for (int i = beg; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (ret > Integer.MAX_VALUE / 10
                    || (ret == Integer.MAX_VALUE / 10
                        && Character.getNumericValue(str.charAt(i))> Integer.MAX_VALUE % 10)) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }

                ret = ret * 10 + Character.getNumericValue(str.charAt(i));
            } else {
                return ret;
            }
        }
        return neg ? ret * (-1) : ret;
    }
}