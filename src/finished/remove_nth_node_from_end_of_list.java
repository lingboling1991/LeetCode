package finished;

import util.ListNode;

import java.util.ArrayList;

public class remove_nth_node_from_end_of_list {
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
}
