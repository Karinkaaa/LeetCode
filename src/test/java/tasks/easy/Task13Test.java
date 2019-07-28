package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task13Test {

    @Test
    public void romanToInt() {

        Assert.assertEquals(3, Task13.romanToInt("III"));
        Assert.assertEquals(4, Task13.romanToInt("IV"));
        Assert.assertEquals(9, Task13.romanToInt("IX"));
        Assert.assertEquals(58, Task13.romanToInt("LVIII"));
        Assert.assertEquals(1994, Task13.romanToInt("MCMXCIV"));
        Assert.assertEquals(500, Task13.romanToInt("D"));
    }
}
