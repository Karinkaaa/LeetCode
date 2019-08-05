package tasks.easy;

public class Task125 {

    public static boolean isPalindrome(String s) {

        if (s == null) return false;

        String[] words = s.split("\\W");

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word);
        }

        String str = stringBuilder.toString();
        String reverseStr = new StringBuilder(str).reverse().toString();

        return str.equalsIgnoreCase(reverseStr);
    }
}
