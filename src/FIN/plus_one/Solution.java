package FIN.plus_one;

public class Solution {
    public static int[] plusOne(int[] digits) {

        int[] res = new int[digits.length + 1];
        int len = digits.length;

        for (int i = len - 1, j = len; i >= 0; i--, j--) {
            res[j] = digits[i];
        }

        digits[len - 1] = digits[len - 1] + 1;
        res[len] = digits[len - 1];

        for (int i = len - 1, j = len; i >= 0; i--, j--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                res[j] = digits[i];
                if (i - 1 >= 0) {
                    digits[i - 1] = digits[i - 1] + 1;
                    res[j - 1] = digits[i - 1];
                } else {
                    res[j - 1] = 1;
                }
            } else {
                break;
            }
        }

        if (res[0] == 0)
            return digits;
        else
            return res;
    }

    public static void main(String arg[]) {
        int[] digits = {0};

        int[] a = plusOne(digits);

        System.out.println(a[1]);
    }
}
