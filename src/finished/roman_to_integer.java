package finished;

import java.util.HashMap;

public class roman_to_integer {

    public static int romanToInt(String s) {

        char[] c = s.toCharArray();
        int[] n = new int[c.length];
        int[] m = new int[c.length];
        int times = 1;
        int j = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        for (int i = 0; i < c.length; i++) {
            n[i] = hm.get(c[i]);
        }

        for (int i = 1; i < n.length; i++) {
            if (n[i] == n[i - 1]) {
                times++;
            } else {
                m[j] = n[i - 1] * times;
                j++;
                times = 1;
            }
        }
        m[j] = n[n.length - 1] * times;

        for (; j > 0; j--) {
            if (m[j - 1] > m[j]) {
                m[j - 1] = m[j - 1] + m[j];
            } else if (m[j - 1] < m[j]) {
                m[j - 1] = m[j] - m[j - 1];
            }
        }

        return m[j];

    }

    public static void main(String arg[]) {
        int res = romanToInt("CXCIX");
        System.out.println(res);
    }
}
