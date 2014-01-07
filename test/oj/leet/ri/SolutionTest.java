package oj.leet.ri;

import oj.leet.lswrc.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

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
     * Method: reverse(int x)
     */
    @Test
    public void testReverse() throws Exception {
        //TODO: Test goes here...
        Solution solution = new Solution();
        org.junit.Assert.assertEquals(12345, solution.reverse(54321));
        org.junit.Assert.assertEquals(1, solution.reverse(1));
        org.junit.Assert.assertEquals(Integer.MAX_VALUE, solution.reverse(Integer.MAX_VALUE));
        org.junit.Assert.assertEquals(Integer.MIN_VALUE, solution.reverse(-1147483649));
        org.junit.Assert.assertEquals(Integer.MIN_VALUE, solution.reverse(Integer.MIN_VALUE));
        org.junit.Assert.assertEquals(0, solution.reverse(0));
    }


} 
