package oj.leet.itr;

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
     * Method: intToRoman(int num)
     */
    @Test
    public void testIntToRoman() throws Exception {
        //TODO: Test goes here...
    }


    /**
     * Method: dToR(int i, int lev)
     */
    @Test
    public void testDToR() throws Exception {
        Solution solution = new Solution();

        assertEquals("MCMLXXX", solution.intToRoman(1980));
        assertEquals("IX", solution.intToRoman(9));
        assertEquals("III", solution.intToRoman(3));
    }

} 
