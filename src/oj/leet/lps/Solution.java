package oj.leet.lps;

import java.util.Arrays;

/**
 * Created by hfeng on 1/4/14.   
 */
public class Solution {
    public String longestPalindrome(String s) {
        StringBuffer ns = new StringBuffer("^#");
        for (int i = 0; i < s.length(); i++) {
            ns.append(s.charAt(i));
            ns.append('#');
        }
        ns.append('$');

        int centIndex = 0;
        int rightIndex = 0;
        int[] values = new int[ns.length()];

        for (int i = 1; i < ns.length() - 1; i++) {
            int currVal = 0;
            if (i < rightIndex) {
                currVal = Math.min(values[2 * centIndex - i], rightIndex - i);
            }

            while(ns.charAt(i + currVal) == ns.charAt(i - currVal)) {
                currVal++;
            }
            values[i] = currVal;
        }


        int maxI = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > values[maxI]) {
                maxI = i;
            }
        }

        StringBuffer result = new StringBuffer("");
        for (int i = maxI - values[maxI] + 1; i <= maxI + values[maxI] - 1; i++) {
            if (ns.charAt(i) != '#' && ns.charAt(i) != '^' && ns.charAt(i) != '$') {
                result.append(ns.charAt(i));
            }
        }

        return result.toString();
    }
}
