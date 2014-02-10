package oj.leet.rnfel;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

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
     * Method: removeNthFromEnd(ListNode head, int n)
     */
    @Test
    public void testRemoveNthFromEnd() throws Exception {
        Solution solution = new Solution();
        ListNode h1 = ListNode.createFromArray(new int[]{1, 2, 3, 4, 5});
        ListNode r1 = ListNode.createFromArray(new int[]{1, 2, 3, 5});

        org.junit.Assert.assertEquals(r1, solution.removeNthFromEnd(h1, 2));

        ListNode h2 = ListNode.createFromArray(new int[]{1, 2});
        ListNode r2 = ListNode.createFromArray(new int[]{1});

        org.junit.Assert.assertEquals(r2, solution.removeNthFromEnd(h2, 1));
        
        ListNode h3 = ListNode.createFromArray(new int[]{1, 2});
        ListNode r3 = ListNode.createFromArray(new int[]{2});

        org.junit.Assert.assertEquals(r3, solution.removeNthFromEnd(h3, 2));
    }


} 
