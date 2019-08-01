package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task69.mySqrt;

public class Task69Test {

    @Test
    public void mySqrtTest() {

        Assert.assertEquals(0, mySqrt(0));
//        Assert.assertEquals(2, mySqrt(4));
  //      Assert.assertEquals(2, mySqrt(8));
        Assert.assertEquals(46340, mySqrt(2147395600));
    }
}