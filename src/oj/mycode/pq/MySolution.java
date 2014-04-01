package oj.mycode.pq;

import java.util.ArrayList;

public class MySolution {

    public ArrayList<int[]> placeQueen(int num) {
        ArrayList<int[]> ret = new ArrayList<int[]>();
        place(num, 0, new int[num], ret);
        return ret;
    }

    private void place(int num, int row, int[] tmp, ArrayList<int[]> result) {
        if (num == row) {
            // Very important, should add clone to the arraylist
            // as the tmp array is ued by all the recursive program
            result.add(tmp.clone());
            return;
        }
        for (int i = 0; i < num; i++) {
            tmp[row] = i;
            boolean canPlace = true;
            for (int j = 0; j < row; j++) {
                int diff = Math.abs(tmp[row] - tmp[j]);
                if (diff == 0 || diff == row - j) {
                    canPlace = false;
                    break;
                }
            }
            if (canPlace) {
                place(num, row + 1, tmp, result);
            }
        }
    }
}
