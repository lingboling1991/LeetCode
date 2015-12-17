package finished.rotate_array;

public class Solution {

    public static void main(String arg[]) {

        int[] nums = {1};
        Solution solution = new Solution();
        solution.rotate(nums, 1);
        System.out.println(nums[0]);
    }

    public void rotate(int[] nums, int k) {
        int[] x = new int[nums.length];

        if (k % x.length != 0) {//如果绕一圈，就没有操作，那么就不需要把x的值赋给nums
            for (int i = 0; i < nums.length; i++) {
                x[(i + k) % x.length] = nums[i];
            }
            for (int i = 0; i < x.length; i++) {
                nums[i] = x[i];
            }
        }
    }
}
