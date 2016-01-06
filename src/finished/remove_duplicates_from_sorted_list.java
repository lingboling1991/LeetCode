package finished;

import java.util.HashSet;

/**
 * Created by Administrator on 2015/12/25.
 */
public class remove_duplicates_from_sorted_list {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode c = head;
        ListNode n = head.next;
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(c.val);

        while (n != null) {
            if (hashSet.contains(n.val)) {
                n = n.next;
                c.next = n;
            } else {
                hashSet.add(n.val);
                n = n.next;
                c = c.next;
            }
        }

        return head;
    }
}
