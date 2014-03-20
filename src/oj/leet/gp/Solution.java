package oj.leet.gp;

import java.util.ArrayList;

public class Solution {

  private void appendPart(int sLeft, int sRight, String tmp, ArrayList<String> result) {
    if (sLeft == 0 && sRight == 0) {
      result.add(tmp);
    }
    if (sLeft > 0) {
      appendPart(sLeft - 1, sRight, tmp + '(', result);
    }
    if (sRight > sLeft) {
      appendPart(sLeft, sRight - 1, tmp + ')', result);
    }
  }

  public ArrayList<String> generateParenthesis(int n) {
    ArrayList<String> ret = new ArrayList<String>();
    if (n == 0) {
      return ret;
    }
    String tt = "";
    appendPart(n, n, tt, ret);
    return ret;
  }
}