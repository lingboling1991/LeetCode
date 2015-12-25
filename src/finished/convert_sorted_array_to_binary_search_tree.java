package finished;

import util.TreeNode;

/**
 * Created by Administrator on 2015/12/19.
 */
public class convert_sorted_array_to_binary_search_tree {
    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0)
            return null;
        else if (nums.length == 1)
            return new TreeNode(nums[0]);

        int start = (nums.length - 1) / 2;
        TreeNode x = new TreeNode(nums[start]);

        int[] left = new int[(nums.length - 1) / 2];
        for (int i = 0; i < left.length; i++)
            left[i] = nums[i];
        x.left = sortedArrayToBST(left);

        int[] right = new int[nums.length - (nums.length - 1) / 2 - 1];
        for (int i = 0; i < right.length; i++)
            right[i] = nums[i + (nums.length - 1) / 2 + 1];
        x.right = sortedArrayToBST(right);

        return x;
    }
}
