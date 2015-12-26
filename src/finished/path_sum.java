package finished;

import util.TreeNode;

/**
 * Created by Administrator on 2015/12/26.
 */
public class path_sum {

    static boolean end = false;
    static int res = 0;

    public static boolean hasPathSum(TreeNode root, int sum) {

        //https://leetcode.com/faq/#different-output
        end = false;
        res = 0;

        if (root == null) {//要考虑负数，不能直接比大小
            return false;
        }
        helper(root, sum);

        return end;
    }

    public static void helper(TreeNode root, int sum) {

        if (root == null || end) {
            return;
        }

        res += root.val;

        if (root.left == null && root.right == null) {
            if (res == sum) {
                end = true;
            }
        }

        helper(root.left, sum);
        helper(root.right, sum);

        res -= root.val;
    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode(8);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(-6);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(9);

        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
//        b.right = d;

        boolean res = hasPathSum(a, 7);

        System.out.println(res);
    }
}
