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
        delete_node_in_a_linked_list test = new delete_node_in_a_linked_list();

        delete_node_in_a_linked_list.ListNode a = test.new ListNode(1);
        delete_node_in_a_linked_list.ListNode b = test.new ListNode(2);
        delete_node_in_a_linked_list.ListNode c = test.new ListNode(3);
        delete_node_in_a_linked_list.ListNode d = test.new ListNode(4);
        delete_node_in_a_linked_list.ListNode e = test.new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        deleteNode(b);
        System.out.println("ddd");
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
