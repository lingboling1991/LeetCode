package finished;

import java.util.Arrays;

public class contains_duplicate {
    public static boolean containsDuplicate(int[] nums) {

        if (nums.length == 0)
            return false;

        Arrays.sort(nums);//自带排序

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int[] in = {5, 4, 2, 8, 1, 2, 3, 4};
        boolean res = containsDuplicate(in);
        System.out.println(res);
    }
}
