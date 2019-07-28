package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task14Test {

    @Test
    public void longestCommonPrefixTest() {

        Assert.assertEquals("fl", Task14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("a", Task14.longestCommonPrefix(new String[]{"a"}));
    }
}