package FIN.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for (int j = 0; j < numRows; j++) {
            ArrayList<Integer> curRow = getRow(j);
            res.add(curRow);
        }
        return res;
    }

    public static ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);

        if (rowIndex == 0) {
            return firstRow;
        } else {
            ArrayList<Integer> res = new ArrayList<>();
            ArrayList<Integer> preRow = getRow(rowIndex - 1);
            res.add(1);
            for (int i = 0; i < preRow.size() - 1; i++) {
                res.add(preRow.get(i) + preRow.get(i + 1));
            }
            res.add(1);

            return res;
        }
    }

    public static void main(String arg[]) {
        System.out.println(generate(5).get(1).get(1));
    }
}
