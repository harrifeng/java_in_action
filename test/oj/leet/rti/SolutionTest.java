package oj.leet.rti;

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
     * Method: romanToInt(String s)
     */
    @Test
    public void testRomanToInt() throws Exception {
        //TODO: Test goes here...
        Solution solution = new Solution();
        org.junit.Assert.assertEquals(1, solution.romanToInt("I"));
        org.junit.Assert.assertEquals(9, solution.romanToInt("IX"));
        org.junit.Assert.assertEquals(11, solution.romanToInt("XI"));
        org.junit.Assert.assertEquals(1996, solution.romanToInt("MCMXCVI"));
        org.junit.Assert.assertEquals(621, solution.romanToInt("DCXXI"));
    }

}
