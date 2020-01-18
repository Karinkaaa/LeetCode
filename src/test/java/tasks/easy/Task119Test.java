package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static tasks.easy.Task119.getRow;

public class Task119Test {

    @Test
    public void getRowTest() {

        List<Integer> row = new ArrayList<>(4);
        row.add(1);
        row.add(3);
        row.add(3);
        row.add(1);

        Assert.assertEquals(row, getRow(3));
    }

    @Test
    public void getRowTest2() {

        List<Integer> row = new ArrayList<>(1);
        row.add(1);

        Assert.assertEquals(row, getRow(0));
    }

    @Test
    public void getRowTest3() {
        Assert.assertEquals(new ArrayList<>(), getRow(-1));
    }
}