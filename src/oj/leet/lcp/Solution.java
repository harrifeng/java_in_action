package oj.leet.lcp;
public class Solution {
    public String longestCommonPrefix(String[] strs){
        StringBuffer sbf = new StringBuffer("");
        if (strs.length == 0) {
            return sbf.toString();
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char target = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i) {
                    return sbf.toString();
                } else if (strs[j].charAt(i) != target) {
                    return sbf.toString();
                }
            }
            sbf.append(target);
        }
        return sbf.toString();
    }
}
