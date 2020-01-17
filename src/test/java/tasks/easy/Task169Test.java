package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task169.majorityElement;

public class Task169Test {

    @Test
    public void majorityElementTest() {

        int[] arr = {3, 2, 3};
        Assert.assertEquals(3, majorityElement(arr));
    }

    @Test
    public void majorityElementTest2() {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        Assert.assertEquals(2, majorityElement(arr));
    }
}