package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task14.longestCommonPrefix;

public class Task14Test {

    @Test
    public void longestCommonPrefixTest() {

        Assert.assertEquals("fl", longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("a", longestCommonPrefix(new String[]{"a"}));
    }
}