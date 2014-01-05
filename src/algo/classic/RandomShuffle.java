package algo.classic;

import java.util.Arrays;

/**
 * Created by hfeng on 1/5/14.
 */
public class RandomShuffle {

    public int[] getArray() {
        return array;
    }

    private int[] array;

    public RandomShuffle(int[] a) {
        this.array = a;
    }

    public int[] rearrangeArray() {
        for (int i = array.length - 1; i >= 1; i--) {
            int j = (int) Math.random() * (i + 1);
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        RandomShuffle rs = new RandomShuffle(aa);
        System.out.println(Arrays.toString(rs.rearrangeArray()));
        System.out.println(Arrays.toString(rs.getArray()));
    }
}
