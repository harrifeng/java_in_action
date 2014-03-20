package oj.leet.ths;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hfeng on 14-1-23.
 */
public class Solution {

  public ArrayList<ArrayList<Integer>> threeSum(int[] num) {

    ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

    Arrays.sort(num);

    for (int i = 0; i < num.length; i++) {
      while (i > 0 && i < num.length && num[i] == num[i - 1]) {
        i++;
      }
      int beg = i + 1;
      int end = num.length - 1;
      while (beg < end) {
        int sum = num[beg] + num[end];

        if (sum + num[i] == 0) {
          ArrayList<Integer> al = new ArrayList<Integer>();
          al.add(num[i]);
          al.add(num[beg]);
          al.add(num[end]);
          ret.add(al);
          while (beg < end && num[beg] == num[beg + 1] && num[end] == num[end - 1]) {
            beg++;
            end--;
          }
          beg++;
          end--;
        } else if (sum + num[i] < 0) {
          beg++;
        } else {
          end--;
        }
      }
    }

    return ret;
  }
}
