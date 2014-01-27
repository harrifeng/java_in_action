package oj.leet.tsc;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: threeSumClosest(int[] num, int target)
     */
    @Test
    public void testThreeSumClosest() throws Exception {
        Solution solution = new Solution();
        int[] arr1 = {-1, 2, 1, -4};
        int[] arr2 = {1, 1, 1, 0};
        int[] arr3 = {0, 0, 0};
        int[] arr4 = {0, 1, 2};
        int[] arr5 = {0, 5, -1, -2, 4, -1, 0, -3, 4, -5};
        int[] arr6 = {0, 2, 1, -3};
        int[] arr7 = {4, 0, 5, -5, 3, 3, 0, -4, -5};
        assertEquals(2, solution.threeSumClosest(arr1, 1));
        assertEquals(3, solution.threeSumClosest(arr2, 100));
        assertEquals(0, solution.threeSumClosest(arr3, 1));
        assertEquals(3, solution.threeSumClosest(arr4, 3));
        assertEquals(1, solution.threeSumClosest(arr5, 1));
        assertEquals(0, solution.threeSumClosest(arr6, 1));
        assertEquals(-2, solution.threeSumClosest(arr7, -2));
    }


}
