package oj.leet.zc;

/**
 * Created by hfeng on 14-1-6.
 */
public class Solution {
    public String convert(String s, int nRows) {
        if (nRows == 1) {
            return s;
        }
        StringBuffer[] sbuf = new StringBuffer[nRows];
        for (int i = 0; i < nRows; i++) {
            sbuf[i] = new StringBuffer();
        }
        int group = nRows * 2 - 2;
        for (int i = 0; i < s.length(); i++) {
            int newi = i % group;
            if (newi < nRows) {
                sbuf[newi].append(s.charAt(i));
            } else {
                sbuf[group - newi].append(s.charAt(i));
            }
        }

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < nRows; i++) {
            result.append(sbuf[i]);
        }
        return result.toString();
    }
}