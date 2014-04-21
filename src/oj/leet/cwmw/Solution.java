package oj.leet.cwmw;

public class Solution {

    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int beg = 0;
        int end = height.length - 1;
        int maxV = Integer.MIN_VALUE;
        while (beg < end) {
            maxV = Math.max(maxV, (end - beg) *
                                  Math.min(height[end], height[beg]));
            if (height[beg] < height[end]) {
                beg++;
            } else {
                end--;
            }
        }
        return maxV;
    }
}
