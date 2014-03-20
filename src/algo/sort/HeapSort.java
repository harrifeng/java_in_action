package algo.sort;

import java.util.Arrays;

/**
 * Created by hfeng on 14-1-6.
 */
public class HeapSort {

  public static void main(String[] args) {
    int[] aa = {11, 3, 5, 7, 2, 4, 6, 8, 16, 9, 1, 12, 10, 13, 14, 15, 17};
    System.out.println(Arrays.toString(aa));

    MinHeap mih = new MinHeap(aa);
    mih.heapSort();
    System.out.println(Arrays.toString(mih.getArray()));

    MaxHeap mah = new MaxHeap(aa);
    mah.heapSort();
    System.out.println(Arrays.toString(mah.getArray()));

  }
}
