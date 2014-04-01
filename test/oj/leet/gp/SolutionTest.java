package oj.leet.gp;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: generateParenthesis(int n)
     */
    @Test
    public void testGenerateParenthesis() throws Exception {
        Solution solution = new Solution();
        int n1 = 3;
        ArrayList<String> expected1 = new ArrayList<String>();
        expected1.add("((()))");
        expected1.add("(()())");
        expected1.add("(())()");
        expected1.add("()(())");
        expected1.add("()()()");
        System.out.println("expected: " + expected1);
        System.out.println("actually: " + solution.generateParenthesis(n1));

        assertThat("", expected1, containsInAnyOrder(solution.generateParenthesis(n1).toArray()));

    }
}
