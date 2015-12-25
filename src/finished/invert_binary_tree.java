package finished;

import util.TreeNode;

public class invert_binary_tree {

    public static TreeNode invertTree(TreeNode root) {

        if (root == null)
            return null;
        else if (root.left == null && root.right == null)
            return root;
        else {
            TreeNode tmp;

            tmp = root.left;
            root.left = invertTree(root.right);//递归，这里记得也是有返回值的
            root.right = invertTree(tmp);

            return root;
        }

    }
}
