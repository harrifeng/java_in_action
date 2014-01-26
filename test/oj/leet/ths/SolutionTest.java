package oj.leet.ths;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

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
        Set<ArrayList<Integer>> result1 = new HashSet<ArrayList<Integer>>();

        int[] a1 = {0, 0, 0, 0};

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(0);
        al1.add(0);
        al1.add(0);
        result1.add(al1);
        assertEquals(result1, new HashSet<ArrayList<Integer>>(solution.threeSum(a1)));
        result1.clear();



        int[] a2 = {-1, 0, 1, 2, -1, -4};
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        ArrayList<Integer> al3 = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> alal = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> soal = new ArrayList<ArrayList<Integer>>();

        al2.add(-1);
        al2.add(0);
        al2.add(1);

        al3.add(-1);
        al3.add(-1);
        al3.add(2);

        result1.add(al2);
        result1.add(al3);

        alal.add(al2);
        alal.add(al3);

        soal = solution.threeSum(a2);

        System.out.println("------------");
        System.out.println("result is  :" + soal);
        System.out.println("expected is:" + alal);

        soal.removeAll(alal);
        alal.removeAll(solution.threeSum(a2));

        System.out.println("------------");
        System.out.println("result is  :" + soal);
        System.out.println("expected is:" + alal);

        org.junit.Assert.assertEquals(soal, alal);
    }



} 
