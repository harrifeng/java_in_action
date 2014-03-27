package oj.leet.lcpn;

import java.util.ArrayList;

public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> ret = new ArrayList<String>();
        StringBuffer tmpString = new StringBuffer();
        letterCom(digits, 0, tmpString, ret);
        return ret;
    }

    private String[] num_letter = {"", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"};

    private void letterCom(String digits, int level, StringBuffer tmpS,
                           ArrayList<String> result) {
        if (level == digits.length()) {
            result.add(tmpS.toString());
            return;
        }
        String nowStr = num_letter[digits.charAt(level) - '0'];
        for (int i = 0; i < nowStr.length(); i++) {
            tmpS.append(nowStr.charAt(i));
            letterCom(digits, level + 1, tmpS, result);
            tmpS.deleteCharAt(tmpS.length() - 1);
        }
    }
}
