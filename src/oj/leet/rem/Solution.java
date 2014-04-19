package oj.leet.rem;

public class Solution {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        }
        // p == 1 is a special case
        if (p.length() == 1) {
            return (s.length() == 1)
                    && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0));
        }

        // Next p is not *
        if (p.charAt(1) != '*') {
            return (s.length() >= 1
                    && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'))
                    && isMatch(s.substring(1), p.substring(1));
        }

        // Next p does be *
        if (isMatch(s, p.substring(2))) {
            // To look forward first, whether they
            // can match without the * match.
            // for example initially, [aaab and a*b], when
            // reaching the condition [b and a*b], the looking
            // forward will save you.
            return true;
        } else {
            return (s.length() >= 1
                    && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'))
                    && isMatch(s.substring(1), p);
        }
    }
}
