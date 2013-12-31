package test.oj.leet.lswrc; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import oj.leet.lswrc.*;

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
     * 
     * Method: lengthOfLongestSubstring(String s) 
     * 
     */ 
    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        Solution solution = new Solution();
        //TODO: Test goes here...
        assertEquals(12, solution.lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
    } 

} 
