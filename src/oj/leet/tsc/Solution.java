package oj.leet.tsc;

import java.util.Arrays;

/**
 * Created by hfeng on 14-1-27.
 */
public class Solution {

  public int threeSumClosest(int[] num, int target) {
    int minV = Integer.MAX_VALUE;
    int ret = Integer.MAX_VALUE;
    Arrays.sort(num);

    for (int i = 0; i + 2 < num.length; i++) {
      int beg = i + 1;
      int end = num.length - 1;
      while (beg < end) {
        int sum = num[i] + num[beg] + num[end];
        int newMin = Math.abs(sum - target);

        if (newMin < minV) {
          minV = newMin;
          ret = sum;
        }

        if (sum - target > 0) {
          end--;
        } else {
          beg++;
        }
      }
    }
    return ret;
  }
}
