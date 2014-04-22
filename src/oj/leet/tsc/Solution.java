package oj.leet.tsc;

import java.util.Arrays;

public class Solution {

    public int threeSumClosest(int[] num, int target) {
        if (num.length < 3) {
            return 0;
        }
        int minSum = Integer.MAX_VALUE;
        int minV = Integer.MAX_VALUE;
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {

            int beg = i + 1;
            int end = num.length - 1;
            while (beg < end) {
                int sum = num[i] + num[beg] + num[end];
                if (sum - target == 0) {
                    return target;
                }
                if (minV > Math.abs(sum - target)) {
                    minV = Math.abs(sum - target);
                    minSum = sum;
                }
                if (sum - target < 0) {
                    beg++;
                } else {
                    end--;
                }
            }
        }
        return minSum;
    }
}
