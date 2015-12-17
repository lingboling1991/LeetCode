package finished.remove_linked_list_elements;

public class Solution {// 看了tags，原来是2-pointers问题，就是一个指针往前走，一个指针在后边记着，这样只要遍历一遍数组就可以

    public static ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        } else if (head.next == null) {
            if (head.val == val) {
                return null;
            } else {
                return head;
            }
        }

        ListNode p = head;
        ListNode n = head.next;

        while (p.next != null) {//一直循环到p是结尾那个节点
            if (head.val == val) {
                head = n;
                p = head;
            } else if (n.val == val) {
                p.next = n.next;
            } else {
                p = n;
            }
            n = n.next;
        }

        if (p.val == val) {//这里p指的是最后一个，如果他也是val，那么就要删掉他
            if (head == p) {
                return null;
            } else {
                ListNode t = head;
                while (t.next != p) {
                    t = t.next;
                }
                t.next = null;
            }
        }

        return head;
    }

    public static void main(String arg[]) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        // ListNode c = new ListNode(3);
        // ListNode d = new ListNode(1);
        // ListNode e = new ListNode(3);

        a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;

        ListNode next = removeElements(a, 1);
        System.out.println(next.val);
    }
}
