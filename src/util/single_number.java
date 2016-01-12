package util;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by lenovo on 2016-1-12 0012.
 */
public class single_number {
	public int singleNumber(int[] nums) {
		HashSet<Integer> x = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (x.contains(nums[i])) x.remove(nums[i]);
			else x.add(nums[i]);
		}
		Iterator<Integer> tmp = x.iterator();
		return tmp.next();
	}
}
