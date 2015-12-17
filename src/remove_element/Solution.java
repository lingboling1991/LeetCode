package remove_element;

import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int i = 0, j = 1, res = 0;

        while (j < nums.length) {
            if (nums[i] == val) {
                while (j < nums.length && nums[j] == val) {
                    j++;
                }
                if (j < nums.length) {
                    nums[i] = nums[j];
                }
            }
            i++;
            j++;
            res = i;
        }

        return res;
    }

    public static void main(String arg[]) {
        int[] nums = {1, 1, 2, 3, 4};
        System.out.println(removeElement(nums, 1));
    }
}
