package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task167.twoSum;

public class Task167Test {

    @Test
    public void twoSumTest() {

        int[] nums = new int[]{2, 7, 11, 15};
        int[] indexes = new int[]{1, 2};
        int target = 9;

        Assert.assertArrayEquals(indexes, twoSum(nums, target));
    }
}