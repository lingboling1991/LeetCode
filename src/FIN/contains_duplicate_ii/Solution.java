package FIN.contains_duplicate_ii;

import java.util.HashMap;

public class Solution {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		if (nums.length == 0 || k == 0) {
			return false;
		}

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int j = 0; j < nums.length; j++) {
			if (!hm.containsKey(nums[j])) {
				hm.put(nums[j], j);
			} else {
				int i = hm.get(nums[j]);
				// 只要有一组满足nums[i]==nums[j]且j-i<=k就可以
				if (j - i <= k) {
					return true;
				} else {
					hm.put(nums[j], j);//更新nums[j]位置，为后面的比较做准备，因为前一个nums[j]已经离得太远了，所以这里要换
				}
			}
		}

		return false;
	}

	public static void main(String args[]) {
		int[] nums = { 1, 0, 1, 1 };
		int k = 1;
		boolean r = containsNearbyDuplicate(nums, k);
		System.out.println(r);
	}
}
