package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static tasks.easy.Task118.generate;

public class Task118Test {

    @Test
    public void generateTest() {

        List<Integer> row = new ArrayList<>();
        row.add(1);

        List<List<Integer>> rows = new ArrayList<>(1);
        rows.add(row);

        Assert.assertEquals(rows, generate(1));
    }

    @Test
    public void generateTest2() {

        List<Integer> row1 = new ArrayList<>();
        row1.add(1);

        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);

        List<Integer> row3 = new ArrayList<>();
        row3.add(1);
        row3.add(2);
        row3.add(1);

        List<Integer> row4 = new ArrayList<>();
        row4.add(1);
        row4.add(3);
        row4.add(3);
        row4.add(1);

        List<Integer> row5 = new ArrayList<>();
        row5.add(1);
        row5.add(4);
        row5.add(6);
        row5.add(4);
        row5.add(1);

        List<List<Integer>> rows = new ArrayList<>(5);
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);

        Assert.assertEquals(rows, generate(5));
    }

    @Test
    public void generateTest3() {
        Assert.assertEquals(new ArrayList<>(), generate(0));
    }
}