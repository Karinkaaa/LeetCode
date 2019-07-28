package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task58.lengthOfLastWord;

public class Task58Test {

    @Test
    public void lengthOfLastWordTest() {

        Assert.assertEquals(5, lengthOfLastWord("Hello World"));
        Assert.assertEquals(1, lengthOfLastWord("a "));
    }
}