package FIN.valid_parentheses;

import java.util.ArrayList;

public class Solution {

	public static boolean isValid(String s) {

		if (s.length() % 2 != 0) {
			return false;
		}

		char[] c = new char[s.length()];
		c = s.toCharArray();

		ArrayList<Character> l = new ArrayList<>();
		for (int i = 0; i < c.length; i++) {
			l.add(c[i]);
		}

		int len = c.length;
		// l.sort(null);//��������Ϊ�����ָ����"(]" �� "([)]"
		// �ǲ��ϸ�ģ���Ȼ�Ļ�����sort()��������һ���򣬻�򵥺ܶ�
		for (int i = 0; i < len; i++) {
			if (l.get(i) == '(' || l.get(i) == '{' || l.get(i) == '[') {
				continue;
			} else if (l.get(i) == ')' && i - 1 >= 0 && l.get(i - 1) == '(') {
				l.remove(i);
				l.remove(i - 1);
				len -= 2;
				i = -1;
			} else if (l.get(i) == ']' && i - 1 >= 0 && l.get(i - 1) == '[') {
				l.remove(i);
				l.remove(i - 1);
				len -= 2;
				i = -1;
			} else if (l.get(i) == '}' && i - 1 >= 0 && l.get(i - 1) == '{') {
				l.remove(i);
				l.remove(i - 1);
				len -= 2;
				i = -1;
			}
		}
		if (l.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String arg[]) {
		System.out.println(isValid("{[}[{}{{({)){[}([]{)}({())[}[}"));
	}
}
