package finished;

public class remove_duplicates_from_sorted_array {
    public static int removeDuplicates(int[] nums) {// 看了tags，原来是2-pointers问题，就是一个指针往前走，一个指针在后边记着，这样只要遍历一遍数组就可以

        int res = 0;

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0, j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
            res = i;
        }

        return res + 1;
    }

    public static void main(String arg[]) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }
}