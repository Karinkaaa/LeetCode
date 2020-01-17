package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task136.singleNumber;

public class Task136Test {

    @Test
    public void singleNumberTest() {

        int[] nums = new int[]{2, 2, 1};
        Assert.assertEquals(1, singleNumber(nums));
    }

    @Test
    public void singleNumberTest2() {

        int[] nums = new int[]{4, 1, 2, 1, 2};
        Assert.assertEquals(4, singleNumber(nums));
    }
}