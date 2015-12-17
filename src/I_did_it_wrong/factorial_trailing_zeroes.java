package I_did_it_wrong;

public class factorial_trailing_zeroes {

    public static int trailingZeroes(int n) {

        int count = 0;
        int t = 1;

        for (int i = 1; i <= n; i++) {
            t = t * i;
            if (t % 10 == 0) {
                t = t / 10;
                count++;
            }
        }

        return count;
    }

    public static void main(String arg[]) {
//		int count = trailingZeroes(12);
        System.out.println(Math.floor(25.9));
    }
}
