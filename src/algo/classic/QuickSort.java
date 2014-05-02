package algo.classic;

import java.util.Arrays;

public class QuickSort {
    public void quickSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    private int partition(int[] array, int beg, int end) {
        int pivot = array[end];
        int i = beg - 1;
        int j = beg;
        for (; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                int tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
            }
        }
        int tmp = array[j];
        array[j] = array[i + 1];
        array[i + 1] = tmp;
        return i + 1;
    }

    private void sort(int[] array, int beg, int end) {
        if (beg < end) {
            int mid = partition(array, beg, end);
            sort(array, beg, mid - 1);
            sort(array, mid + 1, end);
        }
    }
}
