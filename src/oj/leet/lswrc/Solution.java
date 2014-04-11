package oj.leet.lswrc;

import java.util.Arrays;

public class Solution {

    public static final int CHAR_SIZE = 256;

    public int lengthOfLongestSubstring(String s) {

        int[] index = new int[CHAR_SIZE];
        Arrays.fill(index, -1);
        int len = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (index[s.charAt(i)] >= 0) {
                maxLen = Math.max(maxLen, len);
                len = 0;
                i = index[s.charAt(i)] + 1;
                // reinitialize the array after the i get the correct postion
                Arrays.fill(index, -1);
            }
            // Not `else` cases, if use else here, the len will be less than the
            // actual value by 1.
            index[s.charAt(i)] = i;
            len++;
        }
        return Math.max(maxLen, len);
    }
}
