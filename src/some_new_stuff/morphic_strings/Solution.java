package some_new_stuff.morphic_strings;

import java.util.HashMap;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {

        if (s.length() == 0 || s == t)
            return true;

        //这里要用HashMap，不能用循环迭代挨个比对，循环效率太慢
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
