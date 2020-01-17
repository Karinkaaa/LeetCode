package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task125.isPalindrome;

public class Task125Test {

    @Test
    public void isPalindromeTest() {

        String input = "A man, a plan, a canal: Panama";
        Assert.assertTrue(isPalindrome(input));
    }

    @Test
    public void isPalindromeTest2() {
        Assert.assertFalse(isPalindrome(null));
    }

    @Test
    public void isPalindromeTest3() {

        String input = "ab@a";
        Assert.assertTrue(isPalindrome(input));
    }

    @Test
    public void isPalindromeTest4() {

        String input = "ab#a";
        Assert.assertTrue(isPalindrome(input));
    }

    @Test
    public void isPalindromeTest5() {

        String input = "Marge, let's \"went.\" I await news telegram.";
        Assert.assertTrue(isPalindrome(input));
    }

    @Test
    public void isPalindromeTest6() {

        String input = "A man, a plan, a canal -- Panama";
        Assert.assertTrue(isPalindrome(input));
    }

    @Test
    public void isPalindromeTest7() {

        String input = "Live on evasions? No, I save no evil.";
        Assert.assertTrue(isPalindrome(input));
    }
}