package oj.leet.ri;

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
     * Method: reverse(int x)
     */
    @Test
    public void testReverse() throws Exception {
        //TODO: Test goes here...
        Solution solution = new Solution();
        assertEquals(12345, solution.reverse(54321));
        assertEquals(1, solution.reverse(1));
        assertEquals(Integer.MAX_VALUE, solution.reverse(Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, solution.reverse(-1147483649));
        assertEquals(Integer.MIN_VALUE, solution.reverse(Integer.MIN_VALUE));
        assertEquals(0, solution.reverse(0));
        assertEquals(-1234, solution.reverse(-4321));
    }


} 
