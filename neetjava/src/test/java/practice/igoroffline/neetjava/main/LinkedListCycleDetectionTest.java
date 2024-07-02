package practice.igoroffline.neetjava.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleDetectionTest {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean hasCycle(ListNode head) {
        java.util.Set<Integer> visited = new java.util.HashSet<>();
        while (head != null) {
            var hash = hashCode(head);
            if (visited.contains(hash)) {
                return true;
            }
            visited.add(hash);
            head = head.next;
        }

        return false;
    }

    public int hashCode(ListNode li) {
        if (li == null) { return 0; }
        int result = 17;
        result = 31 * result + li.val;
        result = 31 * result + (li.next != null ? li.next.hashCode() : 0);
        return result;
    }

    @Test
    void hasCycle1() {
        var ln0 = new ListNode(1);
        var ln1 = new ListNode(2);
        ln0.next = ln1;
        var ln2 = new ListNode(3);
        ln1.next = ln2;
        var ln3 = new ListNode(4);
        ln2.next = ln3;
        ln3.next = ln1;
        Assertions.assertTrue(hasCycle(ln0));
    }
}
