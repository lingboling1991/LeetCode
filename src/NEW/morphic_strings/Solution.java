package NEW.morphic_strings;

import java.util.HashMap;

public class Solution {
	public static boolean isIsomorphic(String s, String t) {

		if (s.length() == 0 || s == t)
			return true;
		
		//����Ҫ��HashMap��������ѭ�����������ȶԣ�ѭ��Ч��̫��
		HashMap<Character, Character> hm = new HashMap<Character, Character>();

		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();

		for (int i = 0; i < sc.length; i++) {
			if (hm.get(sc[i]) == null) {
				if (hm.containsValue(tc[i])) {
					return false;
				}
				hm.put(sc[i], tc[i]);
			} else if (hm.get(sc[i]) != tc[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		boolean res = isIsomorphic("ab", "aa");
		System.out.println(res);
	}
}
