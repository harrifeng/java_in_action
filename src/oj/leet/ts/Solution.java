package oj.leet.ts;

import java.util.HashMap;

/**
 * Created by hfeng on 14-1-3.
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = numbers.length;
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[0] = map.get(target - numbers[i]) + 1;
                result[1] = i + 1;
                break;
            } else {
                map.put(numbers[i], i);
            }
        }
        return result;
    }
}
