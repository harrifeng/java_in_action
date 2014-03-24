package oj.leet.ths;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

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

        int num1[] = {0, 0, 0, 0};
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(0);
        a1.add(0);
        a1.add(0);
        ArrayList<ArrayList<Integer>> expected1 = new ArrayList<ArrayList<Integer>>();
        expected1.add(a1);
        assertThat("", expected1, containsInAnyOrder(solution.threeSum(num1).toArray()));

        int num2[] = {-1, 0, 1, 2, -1, -4};
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a20 = new ArrayList<Integer>();
        a2.add(-1);
        a2.add(0);
        a2.add(1);
        a20.add(-1);
        a20.add(-1);
        a20.add(2);
        ArrayList<ArrayList<Integer>> expected2 = new ArrayList<ArrayList<Integer>>();
        expected2.add(a2);
        expected2.add(a20);
        assertThat("", expected2, containsInAnyOrder(solution.threeSum(num2).toArray()));

        int num3[] = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        ArrayList<Integer> a30 = new ArrayList<Integer>();
        ArrayList<Integer> a31 = new ArrayList<Integer>();
        ArrayList<Integer> a32 = new ArrayList<Integer>();
        ArrayList<Integer> a33 = new ArrayList<Integer>();
        ArrayList<Integer> a34 = new ArrayList<Integer>();
        a3.add(-4);
        a3.add(-2);
        a3.add(6);

        a30.add(-4);
        a30.add(0);
        a30.add(4);

        a31.add(-4);
        a31.add(1);
        a31.add(3);

        a32.add(-4);
        a32.add(2);
        a32.add(2);

        a33.add(-2);
        a33.add(-2);
        a33.add(4);

        a34.add(-2);
        a34.add(0);
        a34.add(2);

        ArrayList<ArrayList<Integer>> expected3 = new ArrayList<ArrayList<Integer>>();
        expected3.add(a3);
        expected3.add(a30);
        expected3.add(a31);
        expected3.add(a32);
        expected3.add(a33);
        expected3.add(a34);

        assertThat("", expected3, containsInAnyOrder(solution.threeSum(num3).toArray()));

    }
}
