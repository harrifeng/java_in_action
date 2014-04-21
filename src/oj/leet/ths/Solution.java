package oj.leet.ths;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            // if and continue is better solution without judging the valid
            // but pls DO be clear that ONLY continue appears in the if case.
            // extra i++ will lead incomplete results.
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }

            // No need to check whether i is equal(or bigger than) num.length - 2,
            // in the equal case, beg == num.length - 1, which equals end, no loop
            // will happen
            int beg = i + 1;
            int end = num.length - 1;

            while (beg < end) {
                int sum = num[beg] + num[end];
                if (num[i] + sum == 0) {
                    ArrayList<Integer> oneRet = new ArrayList<Integer>();
                    oneRet.add(num[i]);
                    oneRet.add(num[beg]);
                    oneRet.add(num[end]);
                    ret.add(oneRet);
                    // should be while until it is not equal
                    // only duplicated if both beg and end are equal with their neighbor
                    while (beg < end && num[beg] == num[beg + 1] && num[end] == num[end - 1]) {
                        beg++;
                        end--;
                    }
                    beg++;
                    end--;
                } else if (num[i] + sum < 0) {
                    beg++;
                } else {
                    end--;
                }
            }
        }
        return ret;
    }
}
