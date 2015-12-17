package finished.remove_nth_node_from_end_of_list;

import java.util.ArrayList;

public class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null)
            return null;

        ArrayList<ListNode> l = new ArrayList<>();
        ListNode p = head;

        while (p.next != null) {
            l.add(p);
            p = p.next;
        }
        l.add(p);

        int len = l.size();
        if (len - n - 1 >= 0) {
            l.get(len - n - 1).next = l.get(len - n).next;
        } else {
            head = head.next;
        }

        return head;
    }

    public static void main(String arg[]) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        // ListNode c = new ListNode(3);
        // ListNode d = new ListNode(4);
        // ListNode e = new ListNode(5);

        a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;
        b.next = null;

        ListNode res = removeNthFromEnd(a, 2);

        System.out.println(res.val);

    }
}
