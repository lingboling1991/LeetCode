package anagrams;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<String> anagrams(String[] strs) {

		ArrayList<String> res = new ArrayList<>();
		boolean isAnagram = true;

		for (int i = 0; i < strs.length; i++) {
			String curStr = strs[i];
			char[] c = curStr.toCharArray();
			for (int j = 0; j < c.length / 2; j++) {
				if (c[j] != c[c.length - j - 1]) {
					isAnagram = false;
					break;
				}
			}
			if (isAnagram) {
				res.add(curStr);
			}
			isAnagram = true;
		}

		return res;
	}

	public static void main(String arg[]) {
		String[] strs = { "aba", "abc" };
		System.out.println(anagrams(strs).get(1));
	}

}
