package finished;

import java.util.HashMap;

public class valid_anagram {
    public static boolean isAnagram(String s, String t) {

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        if (ss.length != tt.length)
            return false;

        HashMap<Character, Integer> hss = new HashMap<>();
        for (int i = 0; i < ss.length; i++) {
            int counter = 0;
            if (hss.containsKey(ss[i])) {
                counter = hss.get(ss[i]);
                counter++;
            } else {
                counter = 1;
            }
            hss.put(ss[i], counter);
        }

        for (int i = 0; i < tt.length; i++) {
            if (hss.containsKey(tt[i])) {
                int counter = hss.get(tt[i]);
                counter--;
                if (counter < 0) {
                    return false;
                } else {
                    hss.put(tt[i], counter);
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String arg[]) {
        System.out.println(isAnagram("aacc", "ccac"));
    }

}
