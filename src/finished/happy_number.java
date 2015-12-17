package finished;

import java.util.HashMap;

public class happy_number {

    public static boolean isHappy(int n) {

        int res = n;
        int[] a = new int[999];
        int i;
        int tmp = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int j = 0; res != 1; j++) {

            for (i = 0; res != 0; i++) {
                a[i] = res % 10;
                a[i] = a[i] * a[i];
                tmp = tmp + a[i];
                res = res / 10;
            }

            res = tmp;
            tmp = 0;

            if (!hm.containsKey(res)) {
                hm.put(res, j);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String arg[]) {
        System.out.println(isHappy(19));
    }
}
