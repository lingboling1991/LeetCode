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
        // l.sort(null);//这里是因为题干里指出了"(]" 和 "([)]"
        // 是不合格的，不然的话，用sort()函数先排一下序，会简单很多
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
