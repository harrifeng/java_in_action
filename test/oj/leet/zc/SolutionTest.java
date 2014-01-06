package oj.leet.zc;


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
     * Method: convert(String s, int nRows)
     */
    @Test
    public void testConvert() throws Exception {
        //TODO: Test goes here...
        Solution solution = new Solution();
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        assertEquals("ACB", solution.convert("ABC", 2));
        assertEquals("A", solution.convert("A", 1));
        assertEquals("AB", solution.convert("AB", 1));
    }


} 
