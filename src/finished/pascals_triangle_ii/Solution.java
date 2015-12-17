package finished.pascals_triangle_ii;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);

        if (rowIndex == 0) {
            return firstRow;
        } else {
            ArrayList<Integer> res = new ArrayList<>();
            ArrayList<Integer> preRow = (ArrayList<Integer>) getRow(rowIndex - 1);
            res.add(1);
            for (int i = 0; i < preRow.size() - 1; i++) {
                res.add(preRow.get(i) + preRow.get(i + 1));
            }
            res.add(1);

            return res;
        }
    }

    public static void main(String arg[]) {
        System.out.println(getRow(1).get(1));
    }
}
