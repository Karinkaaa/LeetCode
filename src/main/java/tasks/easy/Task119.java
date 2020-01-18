package tasks.easy;

import java.util.ArrayList;
import java.util.List;

public class Task119 {

    public static List<Integer> getRow(int rowIndex) {

        if (rowIndex >= 0) {

            List<Integer> row = new ArrayList<>(1);
            row.add(1);

            if (rowIndex == 0) return row;

            List<Integer> prevRow = new ArrayList<>(2);
            prevRow.add(1);
            prevRow.add(1);

            List<List<Integer>> rows = new ArrayList<>(rowIndex);
            rows.add(row);
            rows.add(prevRow);

            if (rowIndex == 1) return prevRow;

            for (int i = 2; i <= rowIndex; i++) {

                List<Integer> currentRow = new ArrayList<>(i + 1);

                for (int j = 0; j <= i; j++) {

                    if (j == 0 || j == i) {
                        currentRow.add(1);
                    } else {
                        currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
                    }
                }

                rows.add(currentRow);
                prevRow = currentRow;
            }

            return rows.get(rowIndex);
        }

        return new ArrayList<>();
    }
}
