package algo.aha.ses;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;


public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: stripExtraSpaces(String str)
     */
    @Test
    public void testStripExtraSpaces() throws Exception {
        Solution solution = new Solution();
        assertEquals("hello world ", solution.stripExtraSpaces("hello      world  "));
        assertEquals("hello world ", solution.stripExtraSpaces("hello      world "));
    }
}
