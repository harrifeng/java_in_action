package oj.mycode.rbn;

import oj.leet.lswrc.Solution;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * MySolution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class MySolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: rotateArray(int[][] arr)
     */
    @Test
    public void testRotateArray() throws Exception {
        MySolution ms = new MySolution();
        int[][] a1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] r1 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        ms.rotateArray(a1);
        org.junit.Assert.assertArrayEquals(r1, a1);

        int[][] a2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] r2 = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3},{16, 12, 8, 4}};
        ms.rotateArray(a2);
        org.junit.Assert.assertArrayEquals(r2, a2);
    }
}
