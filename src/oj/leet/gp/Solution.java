package oj.leet.gp;

import java.util.ArrayList;

public class Solution {

    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> ret = new ArrayList<String>();
        genPar(new StringBuffer(), n, n, ret);
        return ret;
    }

    private void genPar(StringBuffer sbf, int left, int right, ArrayList<String> result) {
        if (left == 0 && right == 0) {
            result.add(sbf.toString());
            return;
        }

        if (left > 0) {
            sbf.append('(');
            genPar(sbf, left - 1, right, result);
            sbf.deleteCharAt(sbf.length()-1);
        }
        if (right > 0 && right > left) {
            sbf.append(')');
            genPar(sbf,left, right -1, result);
            sbf.deleteCharAt(sbf.length()-1);
        }
    }
}
