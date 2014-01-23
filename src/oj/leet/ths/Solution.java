package oj.leet.ths;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hfeng on 14-1-23.
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {

        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

        Arrays.sort(num);

        for (int i = 0; i < num.length - 2; i++) {
            while ( i > 0 && num[i] == num[i-1]) {
                i++;
            }
            int beg = i+1;
            int end = num.length - 1;
            int target = 0 - num[i];
            while (beg < end) {
                if (num[beg] + num[end] == target) {
                    ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(num[i]);
                    al.add(num[beg]);
                    al.add(num[end]);
                    ret.add(al);
                    beg++;
                    end--;
                } else if (num[beg] + num[end] < target) {
                    beg++;
                } else {
                    end--;
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] n = {1, 7, 3, 4, -8};

        Solution solution = new Solution();
        System.out.println(solution.threeSum(n));
    }
}
