package tasks.easy;

public class Task28 {

    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;

        return haystack.indexOf(needle);
    }
}
