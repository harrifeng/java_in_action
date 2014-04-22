package oj.leet.fs;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (num.length < 4) {
            return ret;
        }
        Arrays.sort(num);

        for (int i = 0; i <= num.length - 4; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }
            for (int j = i + 1; j <= num.length - 3; j++) {
                if (j > i + 1 && num[j] == num[j - 1]) {
                    continue;
                }
                int beg = j + 1;
                int end = num.length - 1;
                while (beg < end) {
                    int sum = num[i] + num[j] + num[beg] + num[end];
                    if (sum == target) {
                        ArrayList<Integer> oneRet = new ArrayList<Integer>();
                        oneRet.add(num[i]);
                        oneRet.add(num[j]);
                        oneRet.add(num[beg]);
                        oneRet.add(num[end]);
                        ret.add(oneRet);
                        while (beg < end && num[beg] == num[beg + 1] && num[end] == num[end - 1]) {
                            beg++;
                            end--;
                        }
                        beg++;
                        end--;
                    } else if (sum < target) {
                        beg++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return ret;
    }
}
