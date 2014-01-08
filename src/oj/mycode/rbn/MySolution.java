package oj.mycode.rbn;

import java.util.Arrays;

/**
 * Created by hfeng on 14-1-8.
 */
public class MySolution {
    public void rotateArray(int[][] arr) {
        arr[0][0] = 123;


    }

    public static void main(String[] args) {
        MySolution ms = new MySolution();
        int[][] arr = {{1, 2, 3}, {1, 2, 3}, {1, 2}, {1,2,3,4}};
        ms.rotateArray(arr);
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[0].length);
        System.out.println(arr.length);
    }
}
