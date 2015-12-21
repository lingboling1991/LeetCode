package finished;

import java.util.ArrayList;
import java.util.List;

public class summary_ranges {
    public static List<String> summaryRanges(int[] nums) {

        int p = 0;
        ArrayList<String> res = new ArrayList<>();

        if (nums.length == 0) {
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1] - 1) {
                continue;
            } else if (i + 1 < nums.length && nums[i] != nums[i + 1] - 1) {
                String s;
                if (i != p) {
                    s = nums[p] + "->" + nums[i];
                } else {
                    s = nums[p] + "";
                }
                res.add(s);
                p = i + 1;
            }
        }

        String s;// 此时i==nums.length-1
        if (nums.length - 1 != p) {
            s = nums[p] + "->" + nums[nums.length - 1];
        } else {
            s = nums[p] + "";
        }
        res.add(s);

        return res;
    }

    public static void main(String arg[]) {
        int[] nums = {0, 1};
        System.out.println(summaryRanges(nums).get(0));
    }
}
