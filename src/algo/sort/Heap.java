package algo.sort;

/**
 * Created by hfeng on 14-1-6.
 */
public class Heap {
    private int[] array;
    private int len;

    public int getLen() {
        return len;
    }

    public int[] getArray() {
        return array;
    }

    public void swapPos(int i, int j) {
        if (i == j) {
            return;
        }

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public Heap(int[] a) {
        this.array = a;
        this.len = a.length;
    }
}
