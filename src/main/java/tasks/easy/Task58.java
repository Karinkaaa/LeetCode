package tasks.easy;

public class Task58 {

    public static int lengthOfLastWord(String s) {

        int count = 0, lastCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (!Character.isWhitespace(s.charAt(i))) {
                count++;
                lastCount = count;
            } else {
                count = 0;
            }
        }
        return lastCount;
    }
}