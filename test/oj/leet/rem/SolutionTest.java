package oj.leet.rem;

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
     * Method: isMatch(String s, String p)
     */
    @Test
    public void testIsMatch() throws Exception {
        Solution solution = new Solution();
//        org.junit.Assert.assertFalse(solution.isMatch("aa", "a"));
//        org.junit.Assert.assertFalse(solution.isMatch("aaa", "a"));
//
//        org.junit.Assert.assertTrue(solution.isMatch("aa", "aa"));
//        org.junit.Assert.assertTrue(solution.isMatch("aa", "a*"));
//
//        org.junit.Assert.assertTrue(solution.isMatch("ab", ".*"));
//        org.junit.Assert.assertTrue(solution.isMatch("aab", "c*a*b"));

        org.junit.Assert.assertTrue(solution.isMatch("aaa", "a*a"));

    }
}
