package oj.leet.lcpn;

import java.util.ArrayList;

/**
 * Created by hfeng on 1/18/14.
 */
public class Solution {
    private String[] ARR = {"", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"};

    private void letCom(String digits, int level, StringBuffer tmp, ArrayList<String> result) {
        if (level == digits.length()) {
            result.add(tmp.toString());
            return;
        }
        String currStr = ARR[digits.charAt(level) - '0'];
        for (int i = 0; i < currStr.length(); i++) {
            tmp.append(currStr.charAt(i));
            letCom(digits, level + 1, tmp, result);
            tmp.deleteCharAt(tmp.length()-1);
        }
    }

    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> al = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();
        letCom(digits, 0, sb, al);
        return al;
    }
}
