package algo.sort;

import java.util.Arrays;

/**
 * Created by hfeng on 1/5/14.
 */
public class QuickSort {

  private int[] array;

  public QuickSort(int[] a) {
    this.array = a;
  }

  public static void main(String[] args) {
    int[] aa = {0, 3, 5, 4, 1, 2};
    QuickSort qs = new QuickSort(aa);
    qs.sort();
    System.out.println(Arrays.toString(qs.getArray()));
  }

  public int[] getArray() {
    return array;
  }

  private int partition(int[] arr, int beg, int end) {

    int i = beg - 1;
    int j = beg;
    int pivot = arr[end];
    for (; j < end; j++) {
      if (arr[j] < pivot) {
        int tmp = arr[i + 1];
        arr[i + 1] = arr[j];
        arr[j] = tmp;
        i++;
      }
    }

    int tmp = arr[end];
    arr[end] = arr[i + 1];
    arr[i + 1] = tmp;

    return i + 1;
  }

  private void qsort(int[] arr, int beg, int end) {
    if (beg < end) {
      int mid = partition(arr, beg, end);
      qsort(arr, beg, mid - 1);
      qsort(arr, mid + 1, end);
    }
  }

  public void sort() {
    qsort(this.array, 0, this.array.length - 1);
  }
}
