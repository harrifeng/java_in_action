package algo.classic;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertArrayEquals;


public class QuickSortTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: quickSort(int[] array)
     */
    @Test
    public void testQuickSort() throws Exception {
        QuickSort qs = new QuickSort();
        int[] arr = {1, 3, 4, 7, 5, 10, 6, 9, 8, 2};
        int[] expect = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        qs.quickSort(arr);
        assertArrayEquals(expect, arr);
    }
}
