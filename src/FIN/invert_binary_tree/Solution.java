package FIN.invert_binary_tree;

public class Solution {

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

	public static void main(String args[]) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;

		TreeNode f = invertTree(a);

		System.out.println(f.right.left.val);

	}
}
