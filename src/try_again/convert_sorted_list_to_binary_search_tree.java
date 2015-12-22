package try_again;

public class convert_sorted_list_to_binary_search_tree {

    private ListNode node;

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        int size = 0;
        ListNode runner = head;
        node = head;

        while (runner != null) {
            runner = runner.next;
            size++;
        }

        return inorderHelper(0, size - 1);
    }

    public TreeNode inorderHelper(int start, int end) {//每调用一次，就会new出一个新节点，node就会往后走一位
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode left = inorderHelper(start, mid - 1);// 链表是有序的，保证了后一个肯定比前一个大，因此中序遍历

        TreeNode treenode = new TreeNode(node.val);
        treenode.left = left;
        node = node.next;

        TreeNode right = inorderHelper(mid + 1, end);
        treenode.right = right;

        return treenode;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        convert_sorted_list_to_binary_search_tree t = new convert_sorted_list_to_binary_search_tree();

        ListNode a = t.new ListNode(1);
        ListNode b = t.new ListNode(2);
        ListNode c = t.new ListNode(3);
        ListNode d = t.new ListNode(4);
        ListNode e = t.new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        t.sortedListToBST(a);
        System.out.println("ddd");
    }
}
