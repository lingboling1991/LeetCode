package TRY.house_robber;

public class Solution {

    public static int biggest(int[] nums) {
        int res = 0;
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > res) {
                res = nums[i];
                tmp = i;
            }
        }

        return tmp;
    }

    public static int rob(int[] nums) {

        int p;
        int res = 0;

        if (nums.length == 0) {
            return 0;
        }

        while (nums[biggest(nums)] != 0) {
            p = biggest(nums);
            if (p - 1 >= 0)
                nums[p - 1] = 0;
            if (p + 1 < nums.length)
                nums[p + 1] = 0;
            res = res + nums[p];
            nums[p] = 0;
        }

        return res;

    }

    public static int robTest(int[] num) {

        if (num.length == 1)
            return num[0];
        if (num.length == 2)
            return Math.max(num[0], num[1]);

        // 一定要能找到状态转移方程，然后才能解决动态规划问题
        int[] dp = new int[999];// dp[i] = max(num[i] + dp[i - 2], dp[i - 1])

        dp[0] = num[0];
        dp[1] = Math.max(num[0], num[1]);

        for (int i = 2; i < num.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + num[i]);
        }

        return dp[num.length - 1];
    }

    public static void main(String arg[]) {
        int[] list = {2, 3, 2};

        int res = robTest(list);

        System.out.println(res);
    }
}
