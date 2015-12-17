package valid_anagram;

import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {

        boolean res = true;

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        HashMap<Integer, Character> hss = new HashMap<>();
        for (int i = 0; i < ss.length; i++) {
            hss.put(i, ss[i]);
        }


        return res;
    }

    public static void main(String arg[]) {
    }

}
