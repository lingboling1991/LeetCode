package finished;

import util.LIstNode;

import java.util.HashMap;

public class intersection_of_two_linked_lists {

    public static LIstNode getIntersectionNode(LIstNode headA, LIstNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        HashMap<LIstNode, Integer> a = new HashMap<>();// 这里要设计好，因为p.next肯定不一样（因为不会成环），但p.val可能会一样，所以应当是ListNode作Key
        LIstNode p = headA;

        while (p.next != null) {
            a.put(p.next, p.val);
            p = p.next;
        }
        a.put(p.next, p.val);

        p = headB;

        while (p.next != null) {
            if (a.get(p.next) != null && a.get(p.next) == p.val) {// a.get(p.next) != null不能省略，否则会报NullPointer异常
                return p;
            }
            p = p.next;
        }
        if (a.get(p.next) != null && a.get(p.next) == p.val) {
            return p;
        }

        return null;
    }

    public static void main(String arg[]) {
        LIstNode a = new LIstNode(1);
        LIstNode b = new LIstNode(2);
        LIstNode c = new LIstNode(3);
        LIstNode d = new LIstNode(4);
        LIstNode e = new LIstNode(5);
//         intersection_of_two_linked_lists.LIstNode f = s.new LIstNode(6);

        a.next = null;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        System.out.println(getIntersectionNode(a, b).val);

    }
}
