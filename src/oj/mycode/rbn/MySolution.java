package oj.mycode.rbn;

import java.util.Arrays;
import java.util.Scanner;

public class MySolution {
    public void rotateArray(int[][] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("------------------");
        
        for (int i = 0; i < size / 2; i++) {
            int count = size - i - 1 ;
            for (int j = i; j < count ; j++) {
                int tmp = arr[i][i+j];
                arr[i][i+j] = arr[count-j][i];
                arr[count-j][i] = arr[count][count-j];
                arr[count][count-j] = arr[i+j][count];
                arr[i+j][count] = tmp;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
    }
}
