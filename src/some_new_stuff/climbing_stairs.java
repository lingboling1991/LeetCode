package some_new_stuff;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/12/25.
 */
public class climbing_stairs {

    static ArrayList<Integer> map = new ArrayList<>();

    public static int climbStairs(int n) {
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else if (map.size() >= n)//这里要弄清楚，还剩n级台阶使得数量，保存在n-1这个位置
            return map.get(n - 1);
        else {
            map.add(climbStairs(n - 1) + climbStairs(n - 2));//这里要保存状态，用空间换时间，这也是动态规划的一个特点
            return map.get(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}
