package oj.leet.gp;

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
 */
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
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("((()))");
        a1.add("(()())");
        a1.add("(())()");
        a1.add("()(())");
        a1.add("()()()");

        ArrayList<String> solutionResult = new ArrayList<String>();
        solutionResult = solution.generateParenthesis(n1);
        System.out.println("------------");
        System.out.println("Solution Result is: " + solutionResult);
        System.out.println("Expected Result is: " + a1);

        solutionResult.removeAll(a1);
        a1.removeAll(solution.generateParenthesis(n1));
        assertEquals(solutionResult, a1);
    }
} 
