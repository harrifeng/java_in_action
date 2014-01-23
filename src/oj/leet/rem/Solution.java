package oj.leet.rem;

/**
 * Created by hfeng on 14-1-9.
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        int ps = 0;
        int pp = 0;

        while (ps < s.length() && pp < p.length()) {
            if (pp < p.length() - 1 && p.charAt(pp+1) == '*') {
                while (ps < s.length() && (p.charAt(pp) == '.' || s.charAt(ps) == p.charAt(pp))) {
                    ps++;
                }
                pp += 2;
            } else {
                if (p.charAt(pp) == '.'|| p.charAt(pp) == s.charAt(ps)) {
                    ps++;
                    pp++;
                } else {
                    return false;
                }
            }
        }
        return (ps == s.length() && pp == p.length());
    }
}
