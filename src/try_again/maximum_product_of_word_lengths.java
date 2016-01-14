package try_again;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Created by Administrator on 2015/12/22.
 */
public class maximum_product_of_word_lengths {
    public static int maxProduct_1(String[] words) {

        Arrays.sort(words, new Comparator<String>() {
            @Override//可以写Comparator来实现自定义规则的比较
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

//        for (int i = 0; i < words.length; i++) {
//            Byte[] first = words[i]. ()
//            for (int j = 1; j < words.length; j++) {
//                if ()
//                    words[i].length() * words[j].length();
//            }
//        }
        return 1;
    }

    public static int maxProduct_2(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override//可以写Comparator来实现自定义规则的比较
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        int len = words.length;
        boolean isSharing = false;
        int res = 0;

        for (int i = len - 1; i >= 0; i--) {
            HashSet<Character> longestHashSet = new HashSet<>();//当前最长的一个字符串，放到HashSet
            char[] longestChars = words[i].toCharArray();
            for (int j = 0; j < longestChars.length; j++) {
                longestHashSet.add(longestChars[j]);
            }
            for (int j = i - 1; j >= 0; j--) {//从当前这个往前看
                char[] curChars = words[j].toCharArray();
                for (int k = 0; k < curChars.length; k++) {
                    if (longestHashSet.contains(curChars[k])) {
                        isSharing = true;
                        break;
                    }
                }
                if (!isSharing && longestChars.length * curChars.length > res) {
                    res = longestChars.length * curChars.length;
                }
                isSharing = false;
            }
        }
        return res;
    }

    public static int maxProduct(String[] words) {

        //这里不需要排序，反正是要都算一遍，因为有可能出现a,ab,cd,bcd这种情况，所以不能从最大的倒着遍历
        int len = words.length;
        boolean isSharing = false;
        int res = 0;

        for (int i = len - 1; i >= 0; i--) {
            char[] lastChars = words[i].toCharArray();
            int[] lastCount = new int[26];
            for (char c : lastChars) lastCount[c - 'a']++;//这里不要用HashSet，因为开销太大，用int[]也能标记

            for (int j = i - 1; j >= 0; j--) {//从当前这个往前看
                char[] curChars = words[j].toCharArray();

                for (int k = 0; k < curChars.length; k++) {
                    if (lastCount[curChars[k] - 'a'] != 0) {
                        //curChars[k]是当前字符串的第k个字符，lastCount[curChars[k] - 'a']是这个字符在longestChars中的个数
                        isSharing = true;
                        break;
                    }
                }
                if (!isSharing && lastChars.length * curChars.length > res) {
                    res = lastChars.length * curChars.length;
                }
                isSharing = false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] x = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};

        System.out.println(maxProduct(x));
    }
}
