package tasks.medium;

import org.junit.Assert;
import org.junit.Test;

import static tasks.medium.Task12.intToRoman;

public class Task12Test {

    @Test
    public void intToRomanTest() {

        Assert.assertEquals("I", intToRoman(1));
        Assert.assertEquals("V", intToRoman(5));
        Assert.assertEquals("X", intToRoman(10));
        Assert.assertEquals("L", intToRoman(50));
        Assert.assertEquals("C", intToRoman(100));
        Assert.assertEquals("D", intToRoman(500));
        Assert.assertEquals("M", intToRoman(1000));
    }
}