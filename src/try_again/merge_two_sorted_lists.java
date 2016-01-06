package try_again;

import util.LIstNode;

public class merge_two_sorted_lists {

    public static LIstNode mergeTwoLists(LIstNode l1, LIstNode l2) {

        if (l1 == null && l2 != null) {// 开始时要考虑清楚，有几种可能的输入情况
            return l2;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else if (l1 == null && l2 == null) {
            return null;
        }

        LIstNode p1 = l1;
        LIstNode p2 = l2;

        int newNodeValue = p1.val <= p2.val ? p1.val : p2.val;
        LIstNode res = new LIstNode(newNodeValue);
        LIstNode p = res;

        if (p1.val == p2.val) {
            LIstNode n = new LIstNode(p2.val);
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
                LIstNode n = new LIstNode(p1.val);
                p.next = n;
                p = p.next;
                p1 = p1.next;
            } else if (p2.val < p1.val) {
                LIstNode n = new LIstNode(p2.val);
                p.next = n;
                p = p.next;
                p2 = p2.next;
            } else {
                LIstNode n1 = new LIstNode(p1.val);
                LIstNode n2 = new LIstNode(p2.val);
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

        LIstNode a = new LIstNode(1);
        LIstNode b = new LIstNode(3);
        LIstNode c = new LIstNode(5);
        LIstNode d = new LIstNode(1);
        LIstNode e = new LIstNode(4);

        a.next = null;
        b.next = c;
        c.next = null;
        d.next = null;
        e.next = null;

        System.out.println(mergeTwoLists(a, d));

    }
}
