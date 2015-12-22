package try_again;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Administrator on 2015/12/22.
 */
public class maximum_product_of_word_lengths {
    public int maxProduct(String[] words) {
        ArrayList<String> alw = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();

        for (String s : words) {
            hm.put(s, s.length());
        }

    }
}
