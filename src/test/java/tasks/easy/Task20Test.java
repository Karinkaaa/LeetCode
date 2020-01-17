package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task20.isValid;

public class Task20Test {

    @Test
    public void isValidTest() {

        Assert.assertTrue(isValid(""));
        Assert.assertTrue(isValid("()"));
        Assert.assertTrue(isValid("() [] {}"));
        Assert.assertTrue(isValid("{[]}"));

        Assert.assertFalse(isValid("]{"));
        Assert.assertFalse(isValid("]"));
        Assert.assertFalse(isValid("[(({})}]"));
        Assert.assertFalse(isValid("(("));
        Assert.assertFalse(isValid("(]"));
        Assert.assertFalse(isValid("{"));
        Assert.assertFalse(isValid("{[]"));
        Assert.assertFalse(isValid("([)]"));
    }
}