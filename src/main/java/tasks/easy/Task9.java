package tasks.easy;

public class Task9 {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        long palindrome = 0;
        long tmpValue = 0;
        long tmpX = x;

        while (tmpX != 0) {

            tmpValue = tmpX % 10;
            palindrome = (palindrome + tmpValue) * 10;
            tmpX /= 10;
        }

        return x == (palindrome / 10);

    }
}
