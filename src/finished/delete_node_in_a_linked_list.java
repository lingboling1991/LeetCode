package finished;

/**
 * Created by Administrator on 2015/12/17.
 */
public class delete_node_in_a_linked_list {


    public static void deleteNode(ListNode node) {
        ListNode nn = node.next;

        while (nn.next != null) {
            node.val = nn.val;
            node = nn;
            nn = nn.next;
        }
        node.val = nn.val;
        node.next = null;
    }


    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        deleteNode(b);
        System.out.println("ddd");
    }
}
