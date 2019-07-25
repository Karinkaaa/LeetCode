package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task1.twoSum;

public class Task1Test {

    @Test
    public void twoSumTest() {

        Assert.assertArrayEquals(new int[]{}, new int[]{});
        Assert.assertArrayEquals(new int[] {0, 1}, twoSum(new int[] {2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[] {1, 3}, twoSum(new int[] {2, 7, 11, 15}, 22));

        int[] array = new int[]{2, 3, 4, 11, 15};
        int target = 9;
        Assert.assertArrayEquals(new int[] {}, twoSum(array, target));
    }
}