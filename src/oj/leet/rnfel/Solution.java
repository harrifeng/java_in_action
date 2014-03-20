package oj.leet.rnfel;

/**
 * Created by hfeng on 14-2-10.
 */


public class Solution {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode later = head;
    for (int i = 0; i < n; i++) {
      later = later.next;
    }

    if (later == null) {
      return head.next;
    }

    ListNode tmp = head;
    while (later.next != null) {
      tmp = tmp.next;
      later = later.next;
    }
    tmp.next = tmp.next.next;
    return head;
  }
}