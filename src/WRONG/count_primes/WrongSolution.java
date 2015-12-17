package WRONG.count_primes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WrongSolution {//这个方法超时了，下回再做

	public static boolean isPrime(int n, HashMap<Integer, Integer> key) {
		for (Iterator<Integer> iterator = key.keySet().iterator(); iterator
				.hasNext();) {
			Integer i = (Integer) iterator.next();
			if (i <= n / 2 && n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int countPrimes(int n) {

		long begintime = System.nanoTime();

		int res = 1;

		HashMap<Integer, Integer> key = new HashMap<>();
		key.put(2, 2);

		if (n <= 1) {
			return 0;
		} else {
			for (int i = 2; i <= n; i++) {
				if (isPrime(i, key)) {
					res++;
					key.put(i, i);
				}
			}
		}

		long endtime = System.nanoTime();

		System.out.println((endtime - begintime)/1000000000);//show second

		return res;
	}

	public static void main(String arg[]) {
		// System.out.println(isPrime(7));
		System.out.println(countPrimes(300000));
	}

}
