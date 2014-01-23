package algo.classic.dp;

/**
 * Created by hfeng on 14-1-10.
 */
public class MinIcon {
    public int minNum(int S) {
        int[] min = new int[S + 1];
        for (int i = 1; i <= S; i++) {
            min[i] = Integer.MAX_VALUE;
        }
        int[] val = {1, 2, 5};
        for (int i = 0; i <= S; i++) {
            for (int j = 0; j < val.length; j++) {
                if (val[j] <= i && min[i-val[j]] + 1 < min[i]) {
                    min[i] = min[i-val[j]] + 1;
                }
            }
        }
        return min[S];
    }

    public static void main(String[] args) {
        MinIcon mi = new MinIcon();
        System.out.println(mi.minNum(11));
    }
}
