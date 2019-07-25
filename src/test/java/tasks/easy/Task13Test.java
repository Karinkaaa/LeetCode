package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task13.romanToInt;

public class Task13Test {

    @Test
    public void romanToIntTest() {

        Assert.assertEquals(3, romanToInt("III"));
        Assert.assertEquals(4, romanToInt("IV"));
        Assert.assertEquals(9, romanToInt("IX"));
        Assert.assertEquals(58, romanToInt("LVIII"));
        Assert.assertEquals(1994, romanToInt("MCMXCIV"));
        Assert.assertEquals(500, romanToInt("D"));
    }
}