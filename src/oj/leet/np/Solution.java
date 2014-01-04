package oj.leet.np;

import java.util.Arrays;

/**
 * Created by hfeng on 14-1-2.
 */

/*      1,2,3 → 1,3,2
        3,2,1, → 1,2,3
        1, 2, 3, 4, 5
        1, 3, 4, 5, 2
        1, 4, 5, 2, 3
        1, 5, 2, 3, 4
        1,1,0,5 → 1,5,1*/
public class Solution {
    public static void nextPermutation(int[] num) {
        if (num.length < 3) {
            return;
        }
        for (int i = 2; i < num.length; i++) {
            if (num[i] > num[1]) {

            }
        }
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};
        nextPermutation(n);
        System.out.println(Arrays.toString(n));
    }
}
