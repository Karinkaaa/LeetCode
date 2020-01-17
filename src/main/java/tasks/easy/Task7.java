package tasks.easy;

public class Task7 {

    public static int reverse(int x) {

        long res = 0, longX = x;
        int tmp;
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        boolean first = true;

        if (x < 0) {
            longX = (long) (Math.abs(x)) * (-1);
        }

        while (longX != 0) {

            tmp = (int) (longX % 10);

            if (first) {

                if (tmp == 0) {
                    first = true;
                } else {
                    res += tmp;
                    first = false;
                }

            } else {
                res = (res * 10) + tmp;
            }

            longX /= 10;
        }

        if (res > maxValue || res < minValue) {
            return 0;
        }

        return (int) res;
    }
}
