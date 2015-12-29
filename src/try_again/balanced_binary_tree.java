package try_again;

import util.TreeNode;

/**
 * Created by lenovo on 2015-12-28 0028.
 */
public class balanced_binary_tree {

	static int deepest, counter;

	public static int helper(TreeNode root) {
		if (root.left == null && root.right == null) {
			return 1;
		}


	}

	public static boolean isBalanced(TreeNode root) {
		deepest = 0;
		counter = 0;

		return helper(root.left) - helper(root.right) <= 1;
	}

}
