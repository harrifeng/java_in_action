package algo.aha.ses;

import java.util.Arrays;

public class Solution {
    String stripExtraSpaces(String str) {
        if (str.length() == 0) {
            return "";
        }

        int prev = 0;
        char[] chArr = str.toCharArray();

        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] != ' ' || (i > 0 && chArr[i-1] != ' ')) {
                chArr[prev] = chArr[i];
                prev++;
            }
        }

        return new String(chArr, 0, prev);
    }

}
