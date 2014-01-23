package oj.leet.cwmw;

/**
 * Created by hfeng on 1/12/14.
 */
public class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxV = Integer.MIN_VALUE;

        while (start < end) {
            int contains = Math.min(height[end], height[start]) * (end - start);
            maxV = Math.max(maxV, contains);

            if (height[start] < height[end]) {
                start ++;
            } else {
                end--;
            }
        }
        return maxV;
    }
}
