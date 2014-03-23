package oj.leet.ths;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (num.length < 3) {
            return ret;
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            while (i > 0 && i < num.length && num[i] == num[i - 1]) {
                i++;
            }
            if (i >= num.length - 2) {
                break;
            }
            int target = num[i] * (-1);
            int beg = i + 1;
            int end = num.length - 1;
            while (beg < end) {
                int sum = num[beg] + num[end];
                if (sum == target) {
                    ArrayList<Integer> oneRet = new ArrayList<Integer>();
                    oneRet.add(num[i]);
                    oneRet.add(num[beg]);
                    oneRet.add(num[end]);
                    ret.add(oneRet);
                    while (beg < num.length - 2 && num[beg] == num[beg+1]) {
                        ++beg;
                    }
                    ++beg;
                    while (end > 1 && num[end] == num[end-1]) {
                        --end;
                    }
                    --end;
                } else if (sum < target) {
                    beg++;
                } else {
                    end--;
                }
            }
        }
        return ret;
    }
}