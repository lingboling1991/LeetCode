package finished;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Administrator on 2016/1/9.
 */
public class binary_tree_paths {
    public static Stack<Integer> x;
    public static ArrayList<String> res;

    public static List<String> binaryTreePaths(TreeNode root) {
        x = new Stack<>();
        res = new ArrayList<>();

        helper(root);
        return res;
    }

    public static void helper(TreeNode root) {
        if (root == null)
            return;
        else
            x.push(root.val);
        if (root.left == null && root.right == null) {
            printOut();
            x.pop();
            return;
        }
        helper(root.left);
        helper(root.right);
        x.pop();
    }

    public static void printOut() {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < x.size() - 1; i++) {
            String tmp = String.valueOf(x.get(i)) + "->";
            stringBuffer.append(tmp);
        }
        String tmp = String.valueOf(x.get(x.size() - 1));
        stringBuffer.append(tmp);

        res.add(stringBuffer.toString());
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        e.left = g;

        binaryTreePaths(a);
    }
}
