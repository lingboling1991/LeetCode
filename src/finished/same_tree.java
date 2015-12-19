package finished;

/**
 * Created by Administrator on 2015/12/19.
 */
public class same_tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q != null)
            return false;
        else if (p != null && q == null)
            return false;
        else if (p == null && q == null)
            return true;
        else {
            if (p.val != q.val)
                return false;
            else if (!isSameTree(p.left, q.left) || !isSameTree(p.right, q.right))
                return false;
            else
                return true;
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
}
