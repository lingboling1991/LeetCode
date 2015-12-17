package NEW.zigzag_conversion;

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

		if (numRows == 1) {//�����ǿ��㣬��νnumRows==1�����ǲ���ת����Ҫ������ȫ
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

		for (int j = 0; j < numRows; j++) {// ��j��
			for (int i = 0; i < parts; i++) {// ��i��
				if (j + i * r < c.length) {
					res += c[j + i * r];
					if (j != 0 && j != numRows - 1
							&& (2 * i + 1) * r - (j + i * r) < c.length) {// ���ǵ�һ�У�Ҳ�������һ�У���Ҫ����б�ŵ���ĸ
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
