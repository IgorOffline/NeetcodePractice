package practice.igoroffline.neetjava.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }

    @Test
    void reverseList1() {
        var ln0 = new ListNode(0);
        var ln1 = new ListNode(1);
        ln0.next = ln1;
        var ln2 = new ListNode(2);
        ln1.next = ln2;
        var ln3 = new ListNode(3);
        ln2.next = ln3;
        var head = reverseList(ln0);
        Assertions.assertEquals(3, head.val);
        Assertions.assertEquals(2, head.next.val);
        Assertions.assertEquals(1, head.next.next.val);
        Assertions.assertEquals(0, head.next.next.next.val);
        Assertions.assertNull(head.next.next.next.next);
    }
}
