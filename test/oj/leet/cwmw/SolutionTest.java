package oj.leet.cwmw;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 12, 2014</pre>
 */
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: maxArea(int[] height)
     */
    @Test
    public void testMaxArea() throws Exception {
        //Has linear time solution
        Solution solution = new Solution();
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 13, 14, 5, 6};
        assertEquals(9, solution.maxArea(arr1));
        assertEquals(18, solution.maxArea(arr2));
    }


} 
