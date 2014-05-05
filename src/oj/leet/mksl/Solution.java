package oj.leet.mksl;

import java.util.ArrayList;

public class Solution {

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.size() == 0) {
            return null;
        }
        return helper(lists, 0, lists.size() - 1);
    }

    private ListNode helper(ArrayList<ListNode> lists, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            return mergeTwoLists(helper(lists, left, mid), helper(lists, mid + 1, right));
        }
        return lists.get(left);
    }

    private ListNode mergeTwoLists(ListNode listA, ListNode listB) {
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        while (listA != null && listB != null) {
            if (listA.val < listB.val) {
                head.next = listA;
                listA = listA.next;
                head = head.next;
            } else {
                head.next = listB;
                listB = listB.next;
                head = head.next;
            }
        }
        if (listA != null) {
            head.next = listA;
        }
        if (listB != null) {
            head.next = listB;
        }
        return tmp.next;
    }
}
