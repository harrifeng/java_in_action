package oj.leet.mksl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    private ListNode getListNodeFromArray(int[] array) {
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        for (int i = 0; i < array.length; i++) {
            head.next = new ListNode(array[i]);
            head = head.next;
        }
        return tmp.next;
    }

    private boolean compareTwoListNode(ListNode listA, ListNode listB) {
        while (listA != null && listB != null) {
            if (listA.val != listB.val) {
                return false;
            }
            listA = listA.next;
            listB = listB.next;
        }
        if (listA == null && listB == null) {
            return true;
        }
        return  false;
    }
    /**
     * Method: mergeKLists(ArrayList<ListNode> lists)
     */
    @Test
    public void testMergeKLists() throws Exception {
        ListNode arr1a = getListNodeFromArray(new int[] {1, 7, 10, 11, 13});
        ListNode arr1b = getListNodeFromArray(new int[] {2, 4, 6, 8, 12, 14});
        ListNode arr1c = getListNodeFromArray(new int[] {3, 5, 9, 15, 16});
        ArrayList<ListNode> arr1 = new ArrayList<ListNode>();
        arr1.add(arr1a);
        arr1.add(arr1b);
        arr1.add(arr1c);
        ListNode exp1 = getListNodeFromArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                                                        12, 13, 14, 15, 16});

        Solution solution = new Solution();
        org.junit.Assert.assertTrue(compareTwoListNode(exp1, solution.mergeKLists(arr1)));


    }

} 
