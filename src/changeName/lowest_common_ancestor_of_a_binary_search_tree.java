package changeName;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/12/22.
 */
public class lowest_common_ancestor_of_a_binary_search_tree {

    public static ArrayList<TreeNode> pathP = new ArrayList<>();
    public static ArrayList<TreeNode> pathQ = new ArrayList<>();

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        helper(root, p, pathP);
        helper(root, q, pathQ);

        for (int i = 0; i < pathP.size(); i++) {
            for (int j = 0; j < pathQ.size(); j++) {
                if (pathP.get(i) == pathQ.get(j)) {
                    return pathP.get(i);
                }
            }
        }

        return null;
    }

    public static int helper(TreeNode root, TreeNode t, ArrayList<TreeNode> path) {
        if (t == root) {
            path.add(root);
            return 1;
        } else if (root.left != null && t.val < root.val) {
            int a = helper(root.left, t, path);
            if (a == 1) {
                path.add(root);
                return 1;
            }
        } else if (root.right != null && t.val > root.val) {
            int b = helper(root.right, t, path);
            if (b == 1) {
                path.add(root);
                return 1;
            }
        }
        return 0;
    }

    //这个helper可以针对任意树，题中所给是bst，需要想办法利用性质简化算法
    public static int helper_wrong(TreeNode root, TreeNode t, ArrayList<TreeNode> path) {

        if (t == root) {
            path.add(root);
            return 1;
        } else {
            if (root.left != null) {
                int a = helper(root.left, t, path);
                if (a == 1) {
                    path.add(root);
                    return 1;
                }
            }
            if (root.right != null) {
                int b = helper(root.right, t, path);
                if (b == 1) {
                    path.add(root);
                    return 1;
                }
            }
            return 0;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        lowest_common_ancestor_of_a_binary_search_tree x = new lowest_common_ancestor_of_a_binary_search_tree();

        TreeNode a = x.new TreeNode(3);
        TreeNode b = x.new TreeNode(1);
        TreeNode c = x.new TreeNode(4);
        TreeNode d = x.new TreeNode(2);
//        TreeNode e = x.new TreeNode(5);
//        TreeNode f = x.new TreeNode(6);
//        TreeNode g = x.new TreeNode(7);

        a.left = b;
        a.right = c;
        b.right = d;
//        b.right = e;
//        d.left = f;
//        e.right = g;

        TreeNode res = lowestCommonAncestor(a, a, d);

        System.out.println(res.val);
    }
}
