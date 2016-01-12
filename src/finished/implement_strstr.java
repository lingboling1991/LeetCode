package finished;

/**
 * Created by Administrator on 2016/1/10.
 */
public class implement_strstr {
    public static int strStr_1(String haystack, String needle) {

        if (needle.equals(""))
            return 0;
        else if (needle.length() > haystack.length())
            return -1;

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();

        int i = 0, j = 0;
        int res = -1;

        while (i < h.length && j < n.length) {
            if (n[j] == h[i]) {
                if (res == -1) {
                    res = i;
                }
                j++;
            } else {
                i = res + 1;
                res = -1;
                j = 0;

            }
            i++;
        }
        return res;
    }

    public static int strStr_2(String haystack, String needle) {//AC

        if (needle.length() > haystack.length()) return -1;//"", "a"
        else if (needle.equals("")) return 0;//"", ""或者"aa", ""

        String[] tmp = haystack.split(needle);

        if (tmp.length == 0) return 0;//针对"aaa", "a"这种情况
        else if (tmp[0].length() < haystack.length()) return tmp[0].length();
        else return -1;
    }

    public static void main(String arg[]) {
        System.out.println(strStr_2("", ""));
    }
}
