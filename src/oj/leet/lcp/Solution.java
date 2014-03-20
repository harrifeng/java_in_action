package oj.leet.lcp;

/**
 * Created by hfeng on 14-1-22.
 */

public class Solution {

  public String longestCommonPrefix(String[] strs) {
    int slen = strs.length;
    if (slen == 0) {
      return "";
    }
    int commonLen = 0;
    for (int i = 0; i < strs[0].length(); i++) {
      char pivot = strs[0].charAt(commonLen);
      for (int j = 1; j < slen; j++) {
        if (strs[j].length() <= commonLen || strs[j].charAt(commonLen) != pivot) {
          return strs[0].substring(0, commonLen);
        }
      }
      commonLen++;
    }

    return strs[0];
  }
}
