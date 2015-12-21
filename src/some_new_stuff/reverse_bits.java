package some_new_stuff;

public class reverse_bits {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {

        char[] r = new char[32];
        for (int i = 0; i < 32; i++) {
            r[i] = '0';
        }
        int j = 0;

        char[] x = Integer.toBinaryString(n).toCharArray();//int转二进制String转char[]，这个转化完成之后，n前面的那些0会被删掉
        for (int i = x.length - 1; i >= 0; i--) {
            r[j] = x[i];
            j++;
        }

        String y = new String(r);//char[]转String
        return Integer.parseUnsignedInt(y, 2);//十进制String转二进制int

    }

    public static void main(String arg[]) {
        System.out.println(reverseBits(43261596));
        System.out.println(Integer.toBinaryString(15065253));
    }
}
