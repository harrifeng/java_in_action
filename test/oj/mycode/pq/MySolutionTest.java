package oj.mycode.pq;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;


public class MySolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: placeQueen(int num)
     */
    @Test
    public void testPlaceQueen() throws Exception {
        MySolution mySolution = new MySolution();
        int num1 = 4;
        ArrayList<int[]> expected1 = new ArrayList<int[]>();
        expected1.add(new int[]{1, 3, 0, 2});
        expected1.add(new int[]{2, 0, 3, 1});

        assertThat("", expected1, containsInAnyOrder(mySolution.placeQueen(num1).toArray()));

        int num2 = 8;
        ArrayList<int[]> expected2 = new ArrayList<int[]>();
        expected2.add(new int[]{0, 4, 7, 5, 2, 6, 1, 3});
        expected2.add(new int[]{0, 5, 7, 2, 6, 3, 1, 4});
        expected2.add(new int[]{0, 6, 3, 5, 7, 1, 4, 2});
        expected2.add(new int[]{0, 6, 4, 7, 1, 3, 5, 2});
        expected2.add(new int[]{1, 3, 5, 7, 2, 0, 6, 4});
        expected2.add(new int[]{1, 4, 6, 0, 2, 7, 5, 3});
        expected2.add(new int[]{1, 4, 6, 3, 0, 7, 5, 2});
        expected2.add(new int[]{1, 5, 0, 6, 3, 7, 2, 4});
        expected2.add(new int[]{1, 5, 7, 2, 0, 3, 6, 4});
        expected2.add(new int[]{1, 6, 2, 5, 7, 4, 0, 3});
        expected2.add(new int[]{1, 6, 4, 7, 0, 3, 5, 2});
        expected2.add(new int[]{1, 7, 5, 0, 2, 4, 6, 3});
        expected2.add(new int[]{2, 0, 6, 4, 7, 1, 3, 5});
        expected2.add(new int[]{2, 4, 1, 7, 0, 6, 3, 5});
        expected2.add(new int[]{2, 4, 1, 7, 5, 3, 6, 0});
        expected2.add(new int[]{2, 4, 6, 0, 3, 1, 7, 5});
        expected2.add(new int[]{2, 4, 7, 3, 0, 6, 1, 5});
        expected2.add(new int[]{2, 5, 1, 4, 7, 0, 6, 3});
        expected2.add(new int[]{2, 5, 1, 6, 0, 3, 7, 4});
        expected2.add(new int[]{2, 5, 1, 6, 4, 0, 7, 3});
        expected2.add(new int[]{2, 5, 3, 0, 7, 4, 6, 1});
        expected2.add(new int[]{2, 5, 3, 1, 7, 4, 6, 0});
        expected2.add(new int[]{2, 5, 7, 0, 3, 6, 4, 1});
        expected2.add(new int[]{2, 5, 7, 0, 4, 6, 1, 3});
        expected2.add(new int[]{2, 5, 7, 1, 3, 0, 6, 4});
        expected2.add(new int[]{2, 6, 1, 7, 4, 0, 3, 5});
        expected2.add(new int[]{2, 6, 1, 7, 5, 3, 0, 4});
        expected2.add(new int[]{2, 7, 3, 6, 0, 5, 1, 4});
        expected2.add(new int[]{3, 0, 4, 7, 1, 6, 2, 5});
        expected2.add(new int[]{3, 0, 4, 7, 5, 2, 6, 1});
        expected2.add(new int[]{3, 1, 4, 7, 5, 0, 2, 6});
        expected2.add(new int[]{3, 1, 6, 2, 5, 7, 0, 4});
        expected2.add(new int[]{3, 1, 6, 2, 5, 7, 4, 0});
        expected2.add(new int[]{3, 1, 6, 4, 0, 7, 5, 2});
        expected2.add(new int[]{3, 1, 7, 4, 6, 0, 2, 5});
        expected2.add(new int[]{3, 1, 7, 5, 0, 2, 4, 6});
        expected2.add(new int[]{3, 5, 0, 4, 1, 7, 2, 6});
        expected2.add(new int[]{3, 5, 7, 1, 6, 0, 2, 4});
        expected2.add(new int[]{3, 5, 7, 2, 0, 6, 4, 1});
        expected2.add(new int[]{3, 6, 0, 7, 4, 1, 5, 2});
        expected2.add(new int[]{3, 6, 2, 7, 1, 4, 0, 5});
        expected2.add(new int[]{3, 6, 4, 1, 5, 0, 2, 7});
        expected2.add(new int[]{3, 6, 4, 2, 0, 5, 7, 1});
        expected2.add(new int[]{3, 7, 0, 2, 5, 1, 6, 4});
        expected2.add(new int[]{3, 7, 0, 4, 6, 1, 5, 2});
        expected2.add(new int[]{3, 7, 4, 2, 0, 6, 1, 5});
        expected2.add(new int[]{4, 0, 3, 5, 7, 1, 6, 2});
        expected2.add(new int[]{4, 0, 7, 3, 1, 6, 2, 5});
        expected2.add(new int[]{4, 0, 7, 5, 2, 6, 1, 3});
        expected2.add(new int[]{4, 1, 3, 5, 7, 2, 0, 6});
        expected2.add(new int[]{4, 1, 3, 6, 2, 7, 5, 0});
        expected2.add(new int[]{4, 1, 5, 0, 6, 3, 7, 2});
        expected2.add(new int[]{4, 1, 7, 0, 3, 6, 2, 5});
        expected2.add(new int[]{4, 2, 0, 5, 7, 1, 3, 6});
        expected2.add(new int[]{4, 2, 0, 6, 1, 7, 5, 3});
        expected2.add(new int[]{4, 2, 7, 3, 6, 0, 5, 1});
        expected2.add(new int[]{4, 6, 0, 2, 7, 5, 3, 1});
        expected2.add(new int[]{4, 6, 0, 3, 1, 7, 5, 2});
        expected2.add(new int[]{4, 6, 1, 3, 7, 0, 2, 5});
        expected2.add(new int[]{4, 6, 1, 5, 2, 0, 3, 7});
        expected2.add(new int[]{4, 6, 1, 5, 2, 0, 7, 3});
        expected2.add(new int[]{4, 6, 3, 0, 2, 7, 5, 1});
        expected2.add(new int[]{4, 7, 3, 0, 2, 5, 1, 6});
        expected2.add(new int[]{4, 7, 3, 0, 6, 1, 5, 2});
        expected2.add(new int[]{5, 0, 4, 1, 7, 2, 6, 3});
        expected2.add(new int[]{5, 1, 6, 0, 2, 4, 7, 3});
        expected2.add(new int[]{5, 1, 6, 0, 3, 7, 4, 2});
        expected2.add(new int[]{5, 2, 0, 6, 4, 7, 1, 3});
        expected2.add(new int[]{5, 2, 0, 7, 3, 1, 6, 4});
        expected2.add(new int[]{5, 2, 0, 7, 4, 1, 3, 6});
        expected2.add(new int[]{5, 2, 4, 6, 0, 3, 1, 7});
        expected2.add(new int[]{5, 2, 4, 7, 0, 3, 1, 6});
        expected2.add(new int[]{5, 2, 6, 1, 3, 7, 0, 4});
        expected2.add(new int[]{5, 2, 6, 1, 7, 4, 0, 3});
        expected2.add(new int[]{5, 2, 6, 3, 0, 7, 1, 4});
        expected2.add(new int[]{5, 3, 0, 4, 7, 1, 6, 2});
        expected2.add(new int[]{5, 3, 1, 7, 4, 6, 0, 2});
        expected2.add(new int[]{5, 3, 6, 0, 2, 4, 1, 7});
        expected2.add(new int[]{5, 3, 6, 0, 7, 1, 4, 2});
        expected2.add(new int[]{5, 7, 1, 3, 0, 6, 4, 2});
        expected2.add(new int[]{6, 0, 2, 7, 5, 3, 1, 4});
        expected2.add(new int[]{6, 1, 3, 0, 7, 4, 2, 5});
        expected2.add(new int[]{6, 1, 5, 2, 0, 3, 7, 4});
        expected2.add(new int[]{6, 2, 0, 5, 7, 4, 1, 3});
        expected2.add(new int[]{6, 2, 7, 1, 4, 0, 5, 3});
        expected2.add(new int[]{6, 3, 1, 4, 7, 0, 2, 5});
        expected2.add(new int[]{6, 3, 1, 7, 5, 0, 2, 4});
        expected2.add(new int[]{6, 4, 2, 0, 5, 7, 1, 3});
        expected2.add(new int[]{7, 1, 3, 0, 6, 4, 2, 5});
        expected2.add(new int[]{7, 1, 4, 2, 0, 6, 3, 5});
        expected2.add(new int[]{7, 2, 0, 5, 1, 4, 6, 3});
        expected2.add(new int[]{7, 3, 0, 2, 5, 1, 6, 4});

        assertThat("", expected2, containsInAnyOrder(mySolution.placeQueen(num2).toArray()));

    }

}
