package some_new_stuff.zigzag_conversion;

public class Solution {
    public static String convert(String s, int numRows) {
        /*	P  I  N		numRows==4
         * 	A LS IG
		 * 	YA HR
		 * 	P  I
		 *	
		 *	P   H		numRows==5
		 *	A  SI
		 *	Y I R
		 *	PL  IG
		 *	A   N
		 */

        if (numRows == 1) {//这里是考点，所谓numRows==1，就是不做转换，要考虑周全
            return s;
        }

        int r = 2 * numRows - 2;
        char[] c = s.toCharArray();
        String res = "";

        int parts;
        if (c.length % r == 0) {
            parts = c.length / r;
        } else {
            parts = (c.length / r) + 1;
        }

        for (int j = 0; j < numRows; j++) {// 第j行
            for (int i = 0; i < parts; i++) {// 第i组
                if (j + i * r < c.length) {
                    res += c[j + i * r];
                    if (j != 0 && j != numRows - 1
                            && (2 * i + 1) * r - (j + i * r) < c.length) {// 不是第一行，也不是最后一行，就要加上斜着的字母
                        res += c[(2 * i + 1) * r - (j + i * r)];
                    }
                }
            }
        }
        return res;
    }

    public static void main(String arg[]) {
        String res = convert("PAYPALISHIRING", 5);
        System.out.println(res);
    }

}
