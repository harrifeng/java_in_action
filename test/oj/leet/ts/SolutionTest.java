package oj.leet.ts;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert.*;
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
     * Method: twoSum(int[] numbers, int target)
     */
    @Test
    public void testTwoSum() throws Exception {
        //TODO: Test goes here...
        Solution solution = new Solution();
        int[] n1 = {2, 7, 11, 15};
        int t1 = 9;
        int[] r1 = {1, 2};

        int [] n2 = {5,75,25};
        int t2 = 100;
        int [] r2 = {2, 3};

        org.junit.Assert.assertArrayEquals(r1, solution.twoSum(n1, t1));
        org.junit.Assert.assertArrayEquals(r2, solution.twoSum(n2, t2));
    }

} 
