package oj.leet.np;

import java.util.Arrays;

public class Solution {

  public static void nextPermutation(int[] num) {
    if (num.length <= 1) {
      return;
    }

    for (int i = num.length - 2; i >= 0; i--) {
      if (num[i] < num[i + 1]) {
        int j;
        for (j = num.length - 1; j >= i; j--) {
          if (num[i] < num[j]) {
            break;
          }
        }
        // swap the two numbres
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;

        // sort the rest of arrays after the swap point
        Arrays.sort(num, i + 1, num.length);
        return;
      }
    }

    // if the whole array is all in descending order(can't become bigger),
    // you have to reverse the whole array
    for (int i = 0; i < num.length / 2; i++) {
      int temp = num[i];
      num[i] = num[num.length - i - 1];
      num[num.length - i - 1] = temp;
    }
    return;
  }
}
