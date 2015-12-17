package FIN.longest_common_prefix;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";//例子可能是空的[]
        } else {

            String result = strs[0];
            char[] t = new char[9999];

            for (int i = 0; i < strs.length; i++) {
                char[] res = result.toCharArray();
                char[] tmp = strs[i].toCharArray();
                int length = 0;

                if (result.equals(strs[i])) {
                    continue;
                } else {
                    length = res.length <= tmp.length ? res.length : tmp.length;

                    for (int j = 0; j < length; j++) {
                        if (res[j] == tmp[j]) {
                            t[j] = res[j];
                        } else {
                            break;//这里要加跳出判断，不然可能会在["aca","cba"]这样的例子中出错
                        }
                    }
                    result = String.valueOf(t);
                    t = new char[t.length];
                }
            }
            return result.trim();
        }
    }

    public static void main(String args[]) {
        String[] arg = {"aca", "cba"};
        String result = longestCommonPrefix(arg);
        System.out.println(result);
    }
}
