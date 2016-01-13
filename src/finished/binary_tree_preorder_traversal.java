package finished;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Administrator on 2016/1/13.
 */
public class binary_tree_preorder_traversal {

    public static ArrayList<Integer> res;

    public List<Integer> preorderTraversal_recursive(TreeNode root) {
        res = new ArrayList<>();

        helper_recursive(root);

        return res;
    }

    public static void helper_recursive(TreeNode root) {
        if (root == null)
            return;

        res.add(root.val);
        helper_recursive(root.left);
        helper_recursive(root.right);
    }

    public List<Integer> preorderTraversal_iterative(TreeNode root) {//可以用Stack来解决递归问题，节约空间

        Stack<TreeNode> stack = new Stack<>();
        if (root != null)
            stack.push(root);

        ArrayList<Integer> res = new ArrayList<>();

        while (stack.size() != 0) {
            TreeNode cur = stack.pop();
            res.add(cur.val);

            if (cur.right != null)
                stack.push(cur.right);
            if (cur.left != null)
                stack.push(cur.left);
        }

        return res;
    }
}
