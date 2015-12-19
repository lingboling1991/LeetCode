package finished;

/**
 * Created by Administrator on 2015/12/18.
 */
public class move_zeroes {
    public void moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int t = nums[j];
                        nums[j] = nums[i];
                        nums[i] = t;
                        break;
                    }
                }
            }
        }
    }
}

