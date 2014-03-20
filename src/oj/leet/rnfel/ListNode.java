package oj.leet.rnfel;

/**
 * Created by hfeng on 14-2-10.
 */
public class ListNode implements Cloneable {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }

  public static ListNode createFromArray(int[] num) {
    if (num.length < 1) {
      return null;
    }
    ListNode tmp = new ListNode(num[0]);
    ListNode hd = tmp;
    for (int i = 1; i < num.length; i++) {
      tmp.next = new ListNode(num[i]);
      tmp = tmp.next;
    }
    return hd;
  }

  public boolean equals(Object otherObject) {
    if (!(otherObject instanceof ListNode)) {
      return false;
    }
    ListNode other = (ListNode) otherObject;
    ListNode self = this;
    while (other != null && self != null && other.val == self.val) {
      other = other.next;
      self = self.next;
    }

    return (self == null && other == null);
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("{");
    ListNode self = this;
    while (self != null) {
      sb.append(" " + self.val);
      self = self.next;
    }
    sb.append(" }");
    return sb.toString();
  }

  public int hashCode() {
    int result = 37;
    ListNode self = this;
    while (self != null) {
      result = 37 * result + (int) self.val;
      self = self.next;
    }
    return result;
  }
}
