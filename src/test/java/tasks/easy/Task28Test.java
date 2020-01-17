package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task28.strStr;

public class Task28Test {

    @Test
    public void strStrTest() {

        Assert.assertEquals(2, strStr("hello", "ll"));
        Assert.assertEquals(-1, strStr("aaaaa", "bba"));
        Assert.assertEquals(0, strStr("abcde", ""));
    }
}