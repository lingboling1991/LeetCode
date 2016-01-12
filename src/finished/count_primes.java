package finished;

public class count_primes {//这个方法超时了，下回再做

	public static int countPrimes(int n) {
		int[] x = new int[n];
		int res = 0;

		for (int i = 2; i < n; i++) {
			if (x[i] == 0) {
				for (int j = 2; i * j < n; j++) {
					x[i * j] = 1;
				}
			}
		}

		for (int i = 1; i < x.length; i++) {
			if (x[i] == 0)
				res++;
		}

		return res;
	}

	public static void main(String arg[]) {
		System.out.println(countPrimes(10));
	}

}
