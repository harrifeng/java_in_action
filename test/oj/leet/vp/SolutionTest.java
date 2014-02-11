package oj.leet.vp;

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
     * Method: isValid(String s)
     */
    @Test
    public void testIsValid() throws Exception {
        Solution solution = new Solution();
        String s1 = "()[]{}";
        Boolean r1 = true;
        String s2 = "([)]";
        Boolean r2 = false;
        String s3 = "[])";
        Boolean r3 = false;

        assertEquals(r1, solution.isValid(s1));
        assertEquals(r2, solution.isValid(s2));
        assertEquals(r3, solution.isValid(s3));
    }


} 
