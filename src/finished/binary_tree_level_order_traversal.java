package finished;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class binary_tree_level_order_traversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {

        ArrayList<TreeNode> levelNode = new ArrayList<>();
        ArrayList<TreeNode> nextLevel = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {// 输入为空，那么返回的也是空
            return res;
        }

        if (root.left != null)// 每次添加前都要验证，看有没有这样一个值
            nextLevel.add(root.left);
        if (root.right != null)
            nextLevel.add(root.right);
        ArrayList<Integer> x = new ArrayList<>();
        x.add(root.val);
        res.add(x);// 先把树的根节点弄进去，之后再开始循环

        while (!nextLevel.isEmpty()) {// 下一层还有节点，那就继续
            while (!nextLevel.isEmpty()) {
                levelNode.add(nextLevel.remove(0));
            }

            ArrayList<Integer> levelValue = new ArrayList<>();

            while (!levelNode.isEmpty()) {// 把每层的点都弹出来，值写到levelValue里，然后把它左右儿子节点放到nextLevel里
                TreeNode p = levelNode.remove(0);
                levelValue.add(p.val);
                if (p.left != null)
                    nextLevel.add(p.left);
                if (p.right != null)
                    nextLevel.add(p.right);
            }

            res.add(levelValue);// 这一层的值放到结果里
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
