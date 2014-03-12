package oj.leet.np;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: nextPermutation(int[] num)
     */
    @Test
    public void testNextPermutation() throws Exception {
        Solution solution = new Solution();
        int[] arr1 = {1, 2, 3};
        solution.nextPermutation(arr1);
        int[] res1 = {1, 3, 2};
        org.junit.Assert.assertArrayEquals(res1, arr1);

        int[] arr2 = {3, 2, 1};
        solution.nextPermutation(arr2);
        int[] res2 = {1, 2, 3};
        org.junit.Assert.assertArrayEquals(res2, arr2);

        int[] arr3 = {3, 4, 1, 2};
        solution.nextPermutation(arr3);
        int[] res3 = {3, 4, 2, 1};
        org.junit.Assert.assertArrayEquals(res3, arr3);

        int[] arr4 = {5,6,8,7,4,3,2,1};
        solution.nextPermutation(arr4);
        int[] res4 = {5,7,1,2,3,4,6,8};
        org.junit.Assert.assertArrayEquals(res4, arr4);
    }
}
