package finished;

import util.TreeNode;

/**
 * Created by Administrator on 2016/1/5.
 */
public class minimum_depth_of_binary_tree {
    public int minDepth(TreeNode root) {//注意算的是叶子节点，所以必须左右子树都为空才返回1
        if (root == null)
            return 0;
        else if (root.left == null && root.right == null)
            return 1;
        else if (root.left == null)
            return minDepth(root.right) + 1;
        else if (root.right == null)
            return minDepth(root.left) + 1;
        else
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
