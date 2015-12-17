package FIN.binary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static List<List<Integer>> levelOrder(TreeNode root) {

		ArrayList<TreeNode> levelNode = new ArrayList<>();
		ArrayList<TreeNode> nextLevel = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();

		if (root == null) {// ����Ϊ�գ���ô���ص�Ҳ�ǿ�
			return res;
		}

		if (root.left != null)// ÿ�����ǰ��Ҫ��֤������û������һ��ֵ
			nextLevel.add(root.left);
		if (root.right != null)
			nextLevel.add(root.right);
		ArrayList<Integer> x = new ArrayList<>();
		x.add(root.val);
		res.add(x);// �Ȱ����ĸ��ڵ�Ū��ȥ��֮���ٿ�ʼѭ��

		while (!nextLevel.isEmpty()) {// ��һ�㻹�нڵ㣬�Ǿͼ���
			while (!nextLevel.isEmpty()) {
				levelNode.add(nextLevel.remove(0));
			}

			ArrayList<Integer> levelValue = new ArrayList<>();

			while (!levelNode.isEmpty()) {// ��ÿ��ĵ㶼��������ֵд��levelValue�Ȼ��������Ҷ��ӽڵ�ŵ�nextLevel��
				TreeNode p = levelNode.remove(0);
				levelValue.add(p.val);
				if (p.left != null)
					nextLevel.add(p.left);
				if (p.right != null)
					nextLevel.add(p.right);
			}

			res.add(levelValue);// ��һ���ֵ�ŵ������
		}
		return res;
	}

	public static void main(String arg[]) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;

		List<List<Integer>> f = levelOrder(a);

		System.out.println(f.get(2));
	}

}
