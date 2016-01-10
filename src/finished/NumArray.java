package finished;

/**
 * Created by Administrator on 2016/1/9.
 */

//range_sum_query_immutable
public class NumArray {
    int[] x;
    int res;

    public NumArray(int[] nums) {
        this.x = nums;
    }

    public int sumRange(int i, int j) {
        res = 0;

        for (int k = i; k <= j; k++) {
            res = res + x[k];
        }
        return res;
    }
}
