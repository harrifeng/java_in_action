package oj.leet.tsc;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int minV = Integer.MAX_VALUE;
        if (num.length < 3) {
            return minV;
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }
            int beg = i + 1;
            int end = num.length - 1;
            while (beg < end) {
                int sum = num[i] + num[beg] + num[end];

                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    beg++;
                } else {
                    end--;
                }
                if (minV > Math.abs(sum - target)) {
                    minV = Math.abs(sum - target);
                    minSum = sum;
                }
            }
        }
        return minSum;
    }
}