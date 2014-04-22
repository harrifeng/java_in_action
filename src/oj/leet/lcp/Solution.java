package oj.leet.lcp;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String mark = strs[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mark.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i) {
                    return sb.toString();
                }
                if (strs[j].charAt(i) != mark.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(mark.charAt(i));
        }
        return sb.toString();
    }
}
