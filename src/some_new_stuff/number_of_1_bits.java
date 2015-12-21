package some_new_stuff;

public class number_of_1_bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

        int r = 0;
        char[] t = Integer.toBinaryString(n).toCharArray();//遇到位运算，可以尝试转化成char数组，解决大问题

        for (int i = 0; i < t.length; i++) {
            if (t[i] == '1') {
                r++;
            }
        }

        return r;

        // int c = 0;
        // while (n != 0) {
        // n = n & (n - 1);
        // ++c;
        // }
        // return c;

    }

    public static void main(String arg[]) {
        System.out.println(hammingWeight(1));
    }

}
