package tasks.easy;

public class Task69 {

    public static int mySqrt(int x) {

        float start = 0, end = x / 2 - 1, midd = x;

        while (end > 0 && start >= 0 && midd > 0) {

            midd = (start + end) / 2;

            if (x < midd * midd) {
                end = midd - 1;
            } else if (x > midd * midd) {
                start = midd - 1;
            } else {
                return (int) midd;
            }
        }

        return (int) midd;
    }
}
