package FIN.compare_version_numbers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static int compareVersion(String version1, String version2) {

        String[] sa = version1.split("\\.");
        ArrayList<String> la = new ArrayList<>(Arrays.asList(sa));
        String[] sb = version2.split("\\.");
        ArrayList<String> lb = new ArrayList<>(Arrays.asList(sb));

        int maxLength = 0;

        if (sa.length <= sb.length) {
            maxLength = sb.length;
            for (int i = 0; i < sb.length - sa.length; i++) {
                la.add("0");
            }
        } else if (sa.length > sb.length) {
            maxLength = sa.length;
            for (int i = 0; i < sa.length - sb.length; i++) {
                lb.add("0");
            }
        }

        for (int i = 0; i < maxLength; i++) {
            if (Integer.valueOf(la.get(i)) < Integer.valueOf(lb.get(i))) {
                return -1;
            } else if (Integer.valueOf(la.get(i)) > Integer.valueOf(lb.get(i))) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String arg[]) {
        System.out.println(compareVersion("1", "0"));
    }
}
