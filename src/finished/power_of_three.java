package finished;

/**
 * Created by Administrator on 2016/1/9.
 */
public class power_of_three {
    public boolean isPowerOfThree(int n) {
        while (n > 1) {
            if (n % 3 != 0)
                return false;
            n = n / 3;
        }
        if (n == 1)
            return true;
        else
            return false;
    }
}
