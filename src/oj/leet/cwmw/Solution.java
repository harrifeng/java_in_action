package oj.leet.cwmw;

public class Solution {

  public int maxArea(int[] height) {
    if (height.length < 2) {
      return 0;
    }
    int beg = 0;
    int end = height.length - 1;
    int maxV = 0;

    while (beg < end) {
      int nowV = (end - beg) * Math.min(height[beg], height[end]);
      maxV = Math.max(maxV, nowV);
      if (height[beg] < height[end]) {
        beg++;
      } else {
        end--;
      }
    }
    return maxV;
  }
}
