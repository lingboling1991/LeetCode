package FIN.valid_palindrome;

public class Solution {
	public static boolean isPalindrome(String s) {

		if (s.length() == 0) {
			return true;
		}
		
		s = s.toLowerCase();
		s = s.replaceAll("\\W", "");

		char[] a = s.toCharArray();
		char[] b = new char[a.length];

		for (int i = 0; i < b.length; i++) {
			b[i] = a[a.length - i - 1];
		}

		String ss = new String(b);

		if (s.equals(ss)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String arg[]) {

		System.out.println(isPalindrome("race a car"));

	}
}
