package FIN.palindrome_number;

public class Solution {
	public static boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		} else if (x == 0) {
			return true;
		}

		int len = 0;
		for (int i = 0; i < 13; i++) {
			double t = x / Math.pow(10, i);
			if ((int) t == 0) {
				len = i;
				break;
			}
		}

		int[] c = new int[len];// ��ν�����ö���Ŀռ䣬Ӧ��ָ���ǲ�������Ӧ���ֳ��Ȱɡ�����
		for (int i = 0; x > 0; i++) {
			c[i] = x % 10;
			x = x / 10;
		}

		for (int i = 0; i < c.length / 2; i++) {
			if (c[i] != c[c.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String arg[]) {
		System.out.println(isPalindrome(100030001));
	}
}
