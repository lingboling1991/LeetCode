package FIN.power_of_two;

public class Solution {
	public static boolean isPowerOfTwo(int n) {

		if (n <= 0) {
			return false;
		}
		
		while (n > 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}

		return true;
	}

	public static void main(String arg[]) {
		System.out.println(isPowerOfTwo(0));
	}
}
