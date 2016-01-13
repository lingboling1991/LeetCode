package finished;

/**
 * Created by Administrator on 2016/1/13.
 */
public class best_time_to_buy_and_sell_stock_ii {
    public static int maxProfit(int[] prices) {
        int cost = Integer.MIN_VALUE;//注意这里，因为本题测试案例中，股价最低可以到0，所以用比0小的值来标记“未购买”这个状态
        int sum = 0;
        int today, pre, next;


        for (int i = 0; i < prices.length; i++) {
            today = prices[i];

            if (i - 1 >= 0) pre = prices[i - 1];
            else pre = prices[0];

            if (i + 1 <= prices.length - 1) next = prices[i + 1];
            else next = prices[prices.length - 1];

            if (today >= pre && today >= next && cost != Integer.MIN_VALUE) {//目前处于顶峰，卖
                sum = sum + (today - cost);
                cost = Integer.MIN_VALUE;
            } else if (today <= pre && today <= next && cost == Integer.MIN_VALUE) {//处于谷底，买
                cost = today;
            }
        }

        return sum;
    }

    public static void main(String arg[]) {
        int[] x = {2, 1, 2, 0, 1};

        System.out.println(maxProfit(x));
    }
}
