package try_again;

import util.TreeNode;

import java.util.ArrayList;

/**
 * Created by lenovo on 2015-12-28 0028.
 */
public class symmetric_tree {

	static ArrayList<Integer> l, r;

	public static void helper1(TreeNode root) {
		if (root == null) {
			l.add(-1);
			return;
		}
		helper1(root.left);
		helper1(root.right);
		l.add(root.val);
	}

	public static void helper2(TreeNode root) {
		if (root == null) {
			r.add(-1);
			return;
		}
		helper2(root.right);
		helper2(root.left);
		r.add(root.val);
	}

	public boolean isSymmetric(TreeNode root) {
		l = new ArrayList<>();
		r = new ArrayList<>();

		helper1(root);
		helper2(root);

		if (l.size() != r.size()) return false;

		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) != r.get(i)) return false;
		}
		return true;
	}
}
