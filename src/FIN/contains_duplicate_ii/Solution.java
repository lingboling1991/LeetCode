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
				// ֻҪ��һ������nums[i]==nums[j]��j-i<=k�Ϳ���
				if (j - i <= k) {
					return true;
				} else {
					hm.put(nums[j], j);//����nums[j]λ�ã�Ϊ����ıȽ���׼������Ϊǰһ��nums[j]�Ѿ����̫Զ�ˣ���������Ҫ��
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
