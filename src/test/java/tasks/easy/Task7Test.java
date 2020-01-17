package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task7.reverse;

public class Task7Test {

    @Test
    public void reverseTest() {

        Assert.assertEquals(321, reverse(123));
        Assert.assertEquals(-321, reverse(-123));
        Assert.assertEquals(21, reverse(120));
    }
}
