package tasks.easy;

public class Task168 {

    public static String convertToTitle(int n) {

        if (n <= 0) return null;

        int max = 26;

        if (n <= max) {
            return Character.toString((char) (n + 64));

        } else {

            if (n % 26 == 0) {
                return convertToTitle((n / max) - 1) + convertToTitle(max);
            } else {
                return convertToTitle(n / max) + convertToTitle(n % max);
            }
        }
    }
}