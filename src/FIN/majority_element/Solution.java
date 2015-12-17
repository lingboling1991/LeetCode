package FIN.majority_element;

import java.util.Arrays;

public class Solution {
    public static int majorityElement(int[] nums) {

        int n = nums.length;
        int count = 1;

        Arrays.sort(nums);
        int key = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == key) {
                count++;
                if (count > n / 2) {
                    return nums[i];
                }
            } else {
                count = 1;
                key = nums[i];
            }
        }
        return key;
    }

    public static void main(String arg[]) {
        int[] n = {1, 2, 3, 4, 9, 4, 4};
        System.out.println(majorityElement(n));
    }
}
