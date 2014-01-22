package oj.leet.lcpn;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 18, 2014</pre>
 */
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: letterCombinations(String digits)
     */
    @Test
    public void testLetterCombinations() throws Exception {
        Solution solution = new Solution();
        ArrayList<String> al = new ArrayList<String>();
        al.add("aa");
        al.add("ab");
        al.add("ac");
        al.add("ba");
        al.add("bb");
        al.add("bc");
        al.add("ca");
        al.add("cb");
        al.add("cc");
        assertEquals(al, solution.letterCombinations("22"));
        al.clear();
        al.add("a");
        al.add("b");
        al.add("c");
        assertEquals(al, solution.letterCombinations("2"));

    }

} 
