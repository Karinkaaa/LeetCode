package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task53.maxSubArray;

public class Task53Test {

    @Test
    public void maxSubArrayTest() {

        Assert.assertEquals(1, maxSubArray(new int[]{-2, 1}));
        Assert.assertEquals(6, maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}