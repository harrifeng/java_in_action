package algo.sort;

/**
 * Created by hfeng on 14-1-6.
 */


public class MinHeap extends Heap {
    public MinHeap(int[] a) {
        super(a);
    }

    public void minHeap(int root, int end) {
        int left = root * 2 + 1;
        int right = root * 2 + 2;
        int min = root;

        if (left <= end && getArray()[left] < getArray()[root]) {
            min = left;
        }
        if (right <= end && getArray()[right] < getArray()[min]) {
            min = right;
        }

        if (min != root) {
            swapPos(min, root);
            minHeap(min, end);
        }
    }

    public void buildMinHeap() {
        for (int i = getLen() / 2; i >= 0; i--) {
            minHeap(i, getLen() - 1);
        }
    }

    public void heapSort() {
        buildMinHeap();
        for (int i = getLen() - 1; i >= 1; i--) {
            swapPos(0, i);
            minHeap(0, i - 1);
        }
    }
}
