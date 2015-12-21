package some_new_stuff;

public class reverse_integer {
    public static int rrr(int x) {
        if (x == Integer.MIN_VALUE)
            return 0;
        int num = Math.abs(x);
        int res = 0;
        while (num != 0) {
            if (res > (Integer.MAX_VALUE - num % 10) / 10)
                return 0;
            res = res * 10 + num % 10;
            num /= 10;
        }
        return x > 0 ? res : -res;
    }

    public static int reverse(int x) {

        char[] y = Integer.toString(x).toCharArray();
        String z = "";
        if (y[0] == '-') {
            z += '-';
            for (int i = y.length - 1; i >= 1; i--) {
                z += y[i];
            }
            //这个异常处理真是跪了。。。越界返回0，抛异常也返回0，也算是学到了新方法
            int r = 100;
            try {
                r = Integer.parseInt(z);
            } catch (NumberFormatException e) {
                return 0;
            }
            if (r < Integer.MIN_VALUE || r > Integer.MAX_VALUE || r > 0) {
                return 0;
            }
            return r;
        } else {
            for (int i = y.length - 1; i >= 0; i--) {
                z += y[i];
            }
            int r = 100;
            try {
                r = Integer.parseUnsignedInt(z);
            } catch (NumberFormatException e) {
                return 0;
            }
            if (r < Integer.MIN_VALUE || r > Integer.MAX_VALUE || r < 0) {
                return 0;
            }
            return r;
        }
    }

    public static void main(String args[]) {
        System.out.println(reverse(1534236469));// 1534236469
    }

}
