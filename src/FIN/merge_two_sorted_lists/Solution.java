package FIN.merge_two_sorted_lists;

public class Solution {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 != null) {// 开始时要考虑清楚，有几种可能的输入情况
            return l2;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else if (l1 == null && l2 == null) {
            return null;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;

        int newNodeValue = p1.val <= p2.val ? p1.val : p2.val;
        ListNode res = new ListNode(newNodeValue);
        ListNode p = res;

        if (p1.val == p2.val) {
            ListNode n = new ListNode(p2.val);
            p.next = n;
            p = p.next;// 这里不要忙中出错，p是要在每次操作后都后移的
            p1 = p1.next;
            p2 = p2.next;
        } else {
            if (newNodeValue == p1.val) {
                p1 = p1.next;
            } else if (newNodeValue == p2.val) {
                p2 = p2.next;
            }
        }

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                ListNode n = new ListNode(p1.val);
                p.next = n;
                p = p.next;
                p1 = p1.next;
            } else if (p2.val < p1.val) {
                ListNode n = new ListNode(p2.val);
                p.next = n;
                p = p.next;
                p2 = p2.next;
            } else {
                ListNode n1 = new ListNode(p1.val);
                ListNode n2 = new ListNode(p2.val);
                p.next = n1;
                p = p.next;
                p.next = n2;
                p = p.next;
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        if (p1 == null) {
            p.next = p2;
        } else if (p2 == null) {
            p.next = p1;
        }

        return res;
    }

    public static void main(String arg[]) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(4);

        a.next = null;
        b.next = c;
        c.next = null;
        d.next = null;
        e.next = null;

        System.out.println(mergeTwoLists(a, d));

    }
}
