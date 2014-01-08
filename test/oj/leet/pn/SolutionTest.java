package oj.leet.pn;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
     * Method: isPalindrome(int x)
     */
    @Test
    public void testIsPalindrome() throws Exception {
        //TODO: Test goes here...
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(1221));
        assertTrue(solution.isPalindrome(12321));
        assertTrue(solution.isPalindrome(1));

        assertFalse(solution.isPalindrome(-2147483648));
        assertFalse(solution.isPalindrome(10));
        assertFalse(solution.isPalindrome(122));
    }


} 
