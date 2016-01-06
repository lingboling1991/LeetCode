package finished;

/**
 * Created by Administrator on 2015/12/17.
 */
public class swap_nodes_in_pairs {
    public ListNode swapPairs(ListNode head) {

        if (head == null) {
            return null;//注意[]这种情况
        }

        ListNode l = head, r = head.next, tmp;

        if (r != null) {
            head = r;
        } else {
            return head;//这里注意[1]这种情况
        }


        while (true) {
            l.next = r.next;
            r.next = l;

            tmp = l;
            l = l.next;
            if (l == null || l.next == null) {//这里注意[1,2,3,4]这种情况，l.next已经是null了，那么它就没有l.next.next
                return head;
            } else {
                tmp.next = l.next;
                r = l.next;
            }
        }
    }
}
