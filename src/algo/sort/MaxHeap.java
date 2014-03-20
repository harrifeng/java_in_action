package algo.sort;

/**
 * Created by hfeng on 14-1-6.
 */
public class MaxHeap extends Heap {

  public MaxHeap(int[] a) {
    super(a);
  }


  public void maxHeap(int root, int end) {
    int left = root * 2 + 1;
    int right = root * 2 + 2;
    int max = root;

    if (left <= end && getArray()[left] > getArray()[root]) {
      max = left;
    }
    if (right <= end && getArray()[right] > getArray()[max]) {
      max = right;
    }

    if (root != max) {
      swapPos(root, max);
      maxHeap(max, end);
    }
  }

  public void buildMaxHeap() {
    for (int i = getLen() / 2; i >= 0; i--) {
      maxHeap(i, getLen() - 1);
    }
  }

  public void heapSort() {
    buildMaxHeap();
    for (int i = getLen() - 1; i >= 1; i--) {
      swapPos(i, 0);
      maxHeap(0, i - 1);
    }
  }
}
