package oj.leet.ths;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>一月 23, 2014</pre>
 */
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: threeSum(int[] num)
     */
    @Test
    public void testThreeSum() throws Exception {
        Solution solution = new Solution();
        int[] a1 = {1, 2, -3};
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(-3);
        al1.add(1);
        al1.add(2);
        ArrayList<ArrayList<Integer>> ret1 = new ArrayList<ArrayList<Integer>>();
        ret1.add(al1);

        System.out.println(ret1.toString());
        org.junit.Assert.assertEquals(ret1.toString(), solution.threeSum(a1).toString());
    }



} 
