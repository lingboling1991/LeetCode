package finished;

import util.LIstNode;

/**
 * Created by Administrator on 2015/12/17.
 */
public class delete_node_in_a_linked_list {


    public static void deleteNode(LIstNode node) {
        LIstNode nn = node.next;

        while (nn.next != null) {
            node.val = nn.val;
            node = nn;
            nn = nn.next;
        }
        node.val = nn.val;
        node.next = null;
    }


    public static void main(String[] args) {
        LIstNode a = new LIstNode(1);
        LIstNode b = new LIstNode(2);
        LIstNode c = new LIstNode(3);
        LIstNode d = new LIstNode(4);
        LIstNode e = new LIstNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        deleteNode(b);
        System.out.println("ddd");
    }
}
