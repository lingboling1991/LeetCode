package finished;

/**
 * Created by lenovo on 2016-1-11 0011.
 */
public class first_bad_version {
	public static boolean isBadVersion(int version) {
		if (version >= 1702766719)
			return true;
		else
			return false;
	}

	public static int firstBadVersion(int n) {
		int start = 1, end = n;

		while (true) {
			if (end <= start)
				return start;
			int res = helper(start, end);

			double a = (double) start / 2;//这里需要注意求中点可能会超出int的最大值
			double b = (double) end / 2;
			int mid = (int) (a + b);

			if (res == mid) {
				end = res;
			} else {
				start = res;
			}
		}
	}

	public static int helper(int start, int end) {
		double a = (double) start / 2;
		double b = (double) end / 2;
		int mid = (int) (a + b);

		if (isBadVersion(mid))
			return mid;//中点是坏的，返回中点，首恶必在start--mid中，调整end位置
		else
			return mid + 1;//中点是好的，首恶必在(mid+1)--end中，调整start位置
	}

	public static void main(String arg[]) {
		int res = firstBadVersion(2126753390);
		System.out.println(res);
	}
}
