package oj.leet.ts;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                int[] ret = new int[2];
                ret[0] = map.get(target - numbers[i]) + 1;
                ret[1] = i + 1;
                return ret;
            } else {
                map.put(numbers[i], i);
            }
        }
        return null;
    }
}