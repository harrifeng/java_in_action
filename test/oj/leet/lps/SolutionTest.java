package oj.leet.lps;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 4, 2014</pre>
 */
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: longestPalindrome(String s)
     */
    @Test
    public void testLongestPalindrome() throws Exception {
        //TODO: Test goes here...
        Solution solution = new Solution();
        assertEquals("cc", solution.longestPalindrome("ccd"));
        assertEquals("bb", solution.longestPalindrome("abb"));
        assertEquals("a", solution.longestPalindrome("a"));
        assertEquals("bcb", solution.longestPalindrome("abcbe"));
        assertEquals("aaabaaa", solution.longestPalindrome("aaabaaaa"));
    }


} 
