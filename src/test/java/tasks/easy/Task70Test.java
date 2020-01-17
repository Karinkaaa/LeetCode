package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task70.climbingStairs;

public class Task70Test {

    @Test
    public void climbingStairsTest() {
        Assert.assertEquals(2, climbingStairs(2));
    }

    @Test
    public void climbingStairsTest2() {
        Assert.assertEquals(13, climbingStairs(6));
    }
}