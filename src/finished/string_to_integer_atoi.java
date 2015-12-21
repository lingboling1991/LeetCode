package finished;

public class string_to_integer_atoi {
    public static int myAtoi(String str) {

        String s = str.trim();
        char[] c = s.toCharArray();

        if (s.length() == 0)
            return 0;

        boolean minus = false;
        if (c[0] == '-') {
            minus = true;
            c[0] = '0';
        } else if (c[0] == '+') {
            c[0] = '0';
        }

        char[] d = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            if ((int) c[i] < 48 || (int) c[i] > 57) {
                break;
            }
            d[i] = c[i];
        }
        String ss = new String(d);
        ss = ss.trim();

        if (ss.length() == 0)
            return 0;

        int a = 0;
        try {
            a = Integer.valueOf(ss);
        } catch (Exception e) {
            if (minus)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }

        if (minus)
            return 0 - a;
        else
            return a;
    }

    public static void main(String arg[]) {
        // char a = '9';// 0==48,9==57
        System.out.println(myAtoi("abc"));// 考虑各种输入的情况："abc"，"+1"，"-1"，"2^128"
    }
}
