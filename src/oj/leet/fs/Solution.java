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

        for (int i = 0; i < num.length - 3; i++) {
            if (i > 0 && (num[i] == num[i - 1])) {
                continue;
            }
            for (int j = i + 1; j < num.length - 2; j++) {
                if (j > i + 1 && (num[j] == num[j - 1])) {
                    continue;
                }

                int beg = j + 1;
                int end = num.length - 1;
                while (beg < end) {
                    int sum = num[beg] + num[end] + num[i] + num[j];

                    if (sum == target) {
                        ArrayList<Integer> al = new ArrayList<Integer>();
                        al.add(num[i]);
                        al.add(num[j]);
                        al.add(num[beg]);
                        al.add(num[end]);
                        ret.add(al);
                        while (beg < end && num[beg] == num[beg + 1]
                               && num[end] == num[end - 1]) {
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
