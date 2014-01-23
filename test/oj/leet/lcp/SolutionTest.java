package oj.leet.lcp;

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
     * Method: longestCommonPrefix(String[] strs)
     */
    @Test
    public void testLongestCommonPrefix() throws Exception {
        //TODO: Test goes here...
        Solution solution = new Solution();
        String[] ss1 = {"abc", "abc", "abcd"};
        String[] ss2 = {"abcd", "ab", "a", "d"};
        String[] ss3 = {"ab", "a"};
        org.junit.Assert.assertEquals("abc", solution.longestCommonPrefix(ss1));
        org.junit.Assert.assertEquals("", solution.longestCommonPrefix(ss2));
        org.junit.Assert.assertEquals("a", solution.longestCommonPrefix(ss3));
    }

}
