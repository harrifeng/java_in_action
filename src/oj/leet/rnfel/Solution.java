package oj.leet.rnfel;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode beg = head;
        ListNode end = head;
        for (int i = 0; i < n; i++) {
            // the n can be invalid
            if (end == null) {
                return head;
            }
            end = end.next;
        }
        if (end == null) {
            return head.next;
        }
        while (end.next != null) {
            end = end.next;
            beg = beg.next;
        }
        beg.next = beg.next.next;
        return head;
    }
}