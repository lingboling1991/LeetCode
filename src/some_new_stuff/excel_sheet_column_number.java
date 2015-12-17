package some_new_stuff;

public class excel_sheet_column_number {

    // Excel Sheet Column Number
    public static int titleToNumber(String s) {

        char[] c = s.toCharArray();
        int n = c.length;
        int res = 0;

        for (int i = 0; i < c.length; i++) {
            double x = (double) ((int) c[i] - 64);
            double y = x * Math.pow(26, n - 1);

            res += (int) y;
            n--;
        }

        return res;
    }

    // Excel Sheet Column Title
    public static String convertToTitle(int n) {// res == a * 26^2 + b * 26^1 + c * 26^0，形如左式，然后取模得最低位系数，然后去掉最低位，再来一遍

        char[] x = new char[99];

        for (int j = 98; n >= 1; j--) {
            int t = n % 26;
            if (t == 0) {
                x[j] = 'Z';
                n -= 26;
            } else {
                x[j] = (char) (t + 64);
            }
            n = n / 26;
        }

        String y = new String(x);

        return y.trim();
    }

    public static void main(String arg[]) {
        // String s = "H";
        // int res = titleToNumber(s);
        // System.out.println(res);// A==65,Z==90
        System.out.println(convertToTitle(28));
    }

}
