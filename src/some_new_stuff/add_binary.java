package some_new_stuff;

/**
 * Created by Administrator on 2016/1/6.
 */
public class add_binary {
    public static String addBinary(String a, String b) {
        String[] aa = a.split("");
        String[] bb = b.split("");

        int max_length = Math.max(aa.length, bb.length);

        String[] res = new String[max_length + 1];
        String[] ax = new String[max_length];
        String[] bx = new String[max_length];

        for (int i = max_length - 1, j = aa.length - 1; i >= 0; i--, j--) {
            if (j >= 0) {
                ax[i] = aa[j];
            } else {
                ax[i] = "0";
            }
        }

        for (int i = max_length - 1, j = bb.length - 1; i >= 0; i--, j--) {
            if (j >= 0) {
                bx[i] = bb[j];
            } else {
                bx[i] = "0";
            }
        }

        int i = max_length - 1;
        int k = max_length;

        boolean flag = false;

        while (i >= 0) {
            int curAA = Integer.valueOf(ax[i]);
            int curBB = Integer.valueOf(bx[i]);
            if (flag) {
                flag = false;
                if ((curAA | curBB) == 1) {
                    flag = true;
                }
                if (curAA == curBB)
                    res[k] = "1";
                else
                    res[k] = "0";
            } else {
                if ((curAA & curBB) == 1) {
                    flag = true;
                    res[k] = "0";
                } else {
                    res[k] = String.valueOf(curAA | curBB);
                }
            }
            k--;
            i--;
        }

        if (flag)
            res[0] = "1";

        String fin = "";
        for (int j = 0; j < res.length; j++) {
            if (res[j] != null)
                fin = fin + res[j];
        }

        return fin;
    }

    public String betterSolution(String a, String b) {
        if (a == null || a.isEmpty()) {
            return b;
        }
        if (b == null || b.isEmpty()) {
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        StringBuilder stb = new StringBuilder();

        int i = aArray.length - 1;
        int j = bArray.length - 1;
        int aByte;
        int bByte;
        int carry = 0;
        int result;

        while (i > -1 || j > -1 || carry == 1) {
            aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;//这样就不用补出余位了
            bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
            result = aByte ^ bByte ^ carry;//相当于三个数来运算
            carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;//判断是否进位的简便算法
            stb.append(result);
        }
        return stb.reverse().toString();//这里可以用reverse函数直接倒转String
    }

    public static void main(String[] args) {
        String res = addBinary("110", "1");
        System.out.println(res);
    }
}
