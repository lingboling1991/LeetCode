package some_new_stuff;

import util.TreeNode;

/**
 * Created by lenovo on 2015-12-28 0028.
 */
public class balanced_binary_tree {

    public static int helper(TreeNode root) {
        if (root != null)
            return Math.max(helper(root.left), helper(root.right)) + 1;
        else
            return 0;
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        else if (Math.abs(helper(root.left) - helper(root.right)) > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);

        a.left = b;
        b.right = c;

        System.out.print(helper(a));
        System.out.print(isBalanced(a));
    }

}
