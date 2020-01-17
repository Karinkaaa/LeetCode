package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task35.searchInsert;

public class Task35Test {

    @Test
    public void searchInsertTest() {

        int[] array = {1, 3, 5, 6};

        Assert.assertEquals(2, searchInsert(array, 5));
        Assert.assertEquals(1, searchInsert(array, 2));
        Assert.assertEquals(4, searchInsert(array, 7));
        Assert.assertEquals(0, searchInsert(array, 0));
    }
}