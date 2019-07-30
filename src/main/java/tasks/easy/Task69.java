package tasks.easy;

public class Task69 {

    public static int mySqrt(int x) {

        for (int i = 1; i < x; i++) {

            if ((i * i) > x) return i - 1;
            if ((i * i) == x) return i;
        }

        return x;
    }
}
