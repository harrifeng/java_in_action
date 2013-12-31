package oj.leet.lswrc;

import java.util.Arrays;

/**
 * Created by hfeng on 13-12-31.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[256];
        Arrays.fill(index, -1);
        int len = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (index[(int)s.charAt(i)] != -1) {
                max = Math.max(max, len);
                len = 0;
                //be careful to change i first, then reinitialize the array
                i = index[(int)s.charAt(i)] + 1;
                Arrays.fill(index, -1);
            }
            index[(int)s.charAt(i)] = i;
            len++;
        }
        return Math.max(max, len);
    }
}
