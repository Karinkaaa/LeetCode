package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task38.countAndSay;

public class Task38Test {

    @Test
    public void countAndSayTest() {

        Assert.assertNull(countAndSay(0));
        Assert.assertNull(countAndSay(-2));
        Assert.assertEquals("1", countAndSay(1));
        Assert.assertEquals("1211", countAndSay(4));
    }
}