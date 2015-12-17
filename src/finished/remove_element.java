package finished;

public class remove_element {
    public static int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }

        int i, j = nums.length - 1, tmp;

        for (i = 0; i <= j; i++) {//这个要注意，它不光想求出长度，也要在这个长度里的数组正确显示，所以不能只计数，也要调整数组情况
            if (nums[i] == val) {
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i--;
                j--;
            }
        }


        for (int x = 0; x < j + 1; x++) {
            System.out.println(nums[x]);
        }


        return j + 1;
    }

    public static void main(String arg[]) {
        int[] nums = {6};
        System.out.println(removeElement(nums, 6));
    }
}
