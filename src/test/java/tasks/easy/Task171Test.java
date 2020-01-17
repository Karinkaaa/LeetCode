package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task171.titleToNumber;

public class Task171Test {

    @Test
    public void titleToNumberTest() {
        Assert.assertEquals(1, titleToNumber("A"));
    }

    @Test
    public void titleToNumberTest2() {
        Assert.assertEquals(28, titleToNumber("AB"));
    }

    @Test
    public void titleToNumberTest3() {
        Assert.assertEquals(701, titleToNumber("ZY"));
    }
}