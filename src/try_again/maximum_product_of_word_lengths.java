package try_again;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Administrator on 2015/12/22.
 */
public class maximum_product_of_word_lengths {
    public static int maxProduct(String[] words) {

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

    public static void main(String[] args) {

        String[] words = {"ab", "nn", "ac"};

        int[] masks = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                int tmp = c - 'a';
                int tmp2 = 1 << tmp;
                masks[i] = masks[i] | tmp2;
//                masks[i] |= 1 << (c - 'a');
            }
        }

        System.out.println("aa");
    }
}
