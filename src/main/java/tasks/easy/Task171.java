package tasks.easy;

public class Task171 {

    public static int titleToNumber(String s) {

        int res = 0;
        int az = 26;
        int offset = 64;
        int strLength = s.length();

        for (int i = 0; i < strLength; i++) {
            res += ((s.charAt(i) - offset) * Math.pow(az, strLength - i - 1));
        }

        return res;
    }
}
