package try_again;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/1/6.
 */
public class bulls_and_cows {
    public static String getHint(String secret, String guess) {
        //！答案很神奇：https://leetcode.com/discuss/67031/one-pass-java-solution
        String[] s = secret.split("");
        String[] g = guess.split("");

        if (s.length == 0)
            return "0A0B";

        int A = 0;
        int B = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            if (hashMap.containsKey(s[i])) {
                int count = hashMap.get(s[i]);
                count++;
                hashMap.put(s[i], count);
            } else {
                hashMap.put(s[i], 1);
            }
        }

        for (int i = 0; i < g.length; i++) {
            if (g[i].equals(s[i])) {
                A++;
                int count = hashMap.get(g[i]);
                count--;
                hashMap.put(g[i], count);
                g[i] = "#";
            }
        }

        for (int i = 0; i < g.length; i++) {
            if (hashMap.containsKey(g[i])) {
                int count = hashMap.get(g[i]);
                if (count > 0) {
                    count--;
                    hashMap.put(g[i], count);
                    B++;
                }
            }
        }

        return A + "A" + B + "B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("1122", "1222"));
    }
}
