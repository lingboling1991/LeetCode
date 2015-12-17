package FIN.remove_duplicates_from_sorted_array;

public class Solution {
	public static int removeDuplicates(int[] nums) {// ����tags��ԭ����2-pointers���⣬����һ��ָ����ǰ�ߣ�һ��ָ���ں�߼��ţ�����ֻҪ����һ������Ϳ���

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
		int[] nums = { 1, 1, 2 };
		System.out.println(removeDuplicates(nums));
	}
}