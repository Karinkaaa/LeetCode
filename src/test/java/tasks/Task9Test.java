package tasks;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task9.isPalindrome;

public class Task9Test {

    @Test
    public void isPalindromeTest() {

        Assert.assertTrue(isPalindrome(121));
        Assert.assertFalse(isPalindrome(-121));
        Assert.assertFalse(isPalindrome(10));
    }
}