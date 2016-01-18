package finished;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/1/15.
 */
public class missing_number {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return i;//这里注意，i已经++过了，所以直接返回i就好
    }
}
