package oj.leet.zc;

public class Solution {

    public String convert(String s, int nRows) {
        if (nRows == 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[nRows];
        for (int i = 0; i < nRows; i++) {
            sb[i] = new StringBuilder();
        }
        int group = 2 * nRows - 2;
        for (int i = 0; i < s.length(); i++) {
            int index = i % group;
            if (index < nRows) {
                sb[index].append(s.charAt(i));
            } else {
                sb[group - index].append(s.charAt(i));
            }
        }

        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < nRows; i++) {
            ret.append(sb[i].toString());
        }
        return ret.toString();
    }
}
