package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task26.removeDuplicates;

public class Task26Test {

    @Test
    public void removeDuplicatesTest() {

        Assert.assertEquals(0, removeDuplicates(new int[]{}));

        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Assert.assertEquals(5, removeDuplicates(nums));
    }
}