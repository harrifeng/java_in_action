package oj.leet.fs;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

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
     * Method: fourSum(int[] num, int target)
     */
    @Test
    public void testFourSum() throws Exception {

        Solution solution = new Solution();

        int[] a1 = {1, 0, -1, 0, -2, 2};
        int t1 = 0;
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        ArrayList<Integer> al3 = new ArrayList<Integer>();

        ArrayList<ArrayList<Integer>> alal = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> soal = new ArrayList<ArrayList<Integer>>();

        al1.add(-1);
        al1.add(0);
        al1.add(0);
        al1.add(1);

        al2.add(-2);
        al2.add(-1);
        al2.add(1);
        al2.add(2);

        al3.add(-2);
        al3.add(0);
        al3.add(0);
        al3.add(2);

        alal.add(al1);
        alal.add(al2);
        alal.add(al3);

        soal = solution.fourSum(a1, t1);


        System.out.println("------------");
        System.out.println("result is  :" + soal);
        System.out.println("expected is:" + alal);

        soal.removeAll(alal);
        alal.removeAll(solution.fourSum(a1, t1));

        System.out.println("------------");
        System.out.println("result is  :" + soal);
        System.out.println("expected is:" + alal);

        org.junit.Assert.assertEquals(soal, alal);
    }


} 
