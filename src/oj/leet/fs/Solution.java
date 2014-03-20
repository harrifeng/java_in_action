package oj.leet.fs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hfeng on 14-2-8.
 */
public class Solution {

  public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
    ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    if (num.length < 4) {
      return ret;
    }

    Arrays.sort(num);

    for (int i = 0; i < num.length - 3; i++) {
      if (i > 0 && (num[i] == num[i - 1])) {
        continue;
      }
      for (int j = i + 1; j < num.length - 2; j++) {
        if (j > i + 1 && (num[j] == num[j - 1])) {
          continue;
        }

        int end = num.length - 1;
        for (int beg = j + 1; beg < end; beg++) {
          if (beg > j + 1 && (num[beg] == num[beg - 1])) {
            continue;
          }

          int sum = num[beg] + num[end] + num[i] + num[j];
          if (sum == target) {
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(num[i]);
            al.add(num[j]);
            al.add(num[beg]);
            al.add(num[end]);
            ret.add(al);
          } else if (sum > target) {
            beg--;
            end--;
          }
        }
      }
    }
    return ret;
  }
}