package tasks.easy;

import java.util.ArrayList;
import java.util.List;

public class Task118 {

    public static List<List<Integer>> generate(int numRows) {

        if (numRows == 0) return new ArrayList<>();

        List<Integer> row = new ArrayList<>(1);
        row.add(1);

        List<List<Integer>> rows = new ArrayList<>(numRows);
        rows.add(row);

        if (numRows == 1) return rows;

        List<Integer> prevRow = new ArrayList<>(2);
        prevRow.add(1);
        prevRow.add(1);

        rows.add(prevRow);

        for (int i = 3; i <= numRows; i++) {

            List<Integer> currentRow = new ArrayList<>(i);

            for (int j = 0; j < i; j++) {

                if (j == 0 || j == i - 1) {
                    currentRow.add(1);
                } else {
                    currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }

            rows.add(currentRow);
            prevRow = currentRow;
        }

        return rows;
    }
}
