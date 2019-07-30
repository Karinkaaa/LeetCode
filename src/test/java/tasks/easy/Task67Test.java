package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task67.addBinary;

public class Task67Test {

    @Test
    public void addBinaryTest() {

        Assert.assertEquals("100", addBinary("11", "1"));
        Assert.assertEquals("1100", addBinary("11", "1001"));
        Assert.assertEquals("10101", addBinary("1010", "1011"));
        Assert.assertEquals("1000", addBinary("1", "111"));
    }
}