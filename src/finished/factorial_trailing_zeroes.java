package finished;

public class factorial_trailing_zeroes {

    public static int trailingZeroes(int n) {
        int count = 0;

        for (int i = 1; n / Math.pow(5, i) > 0.5; i++) {//n / Math.pow(5, i)是double型的，所以不能和0比大小
            count = (int) (count + n / Math.pow(5, i));//有一个5，则会多一个0，然而25一个数字中有两个5，所以要计两遍，同样的，125要计三遍
        }

        return count;
    }

    public static void main(String arg[]) {
        int count = trailingZeroes(2147483647);
        System.out.print(count);
    }
}
