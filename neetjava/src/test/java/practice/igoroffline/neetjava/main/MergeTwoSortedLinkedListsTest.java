package practice.igoroffline.neetjava.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedLinkedListsTest {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    @Test
    void reverseList1() {
        var ln0 = new ListNode(1);
        var ln1 = new ListNode(3);
        ln0.next = ln1;

        var ln2 = new ListNode(2);
        var ln3 = new ListNode(4);
        ln2.next = ln3;

        var head = mergeTwoLists(ln0, ln2);
        Assertions.assertEquals(1, head.val);
        Assertions.assertEquals(2, head.next.val);
        Assertions.assertEquals(3, head.next.next.val);
        Assertions.assertEquals(4, head.next.next.next.val);
        Assertions.assertNull(head.next.next.next.next);
    }
}
