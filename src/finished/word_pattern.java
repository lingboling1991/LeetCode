package finished;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/1/6.
 */
public class word_pattern {
    public static boolean wordPattern(String pattern, String str) {

        if (!str.equals("") && !pattern.equals("")) {//考虑清楚边界条件
            String[] keys = pattern.split("");
            String[] values = str.split(" ");

            if (keys.length != values.length)
                return false;

            HashMap<String, String> hashMap = new HashMap<>();

            for (int i = 0; i < keys.length; i++) {
                if (hashMap.containsKey(keys[i])) {
                    if (!hashMap.get(keys[i]).equals(values[i]))
                        return false;
                } else if (hashMap.containsValue(values[i])) {
                    return false;
                } else {
                    hashMap.put(keys[i], values[i]);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("", "dog"));
    }
}
