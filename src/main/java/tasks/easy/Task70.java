package tasks.easy;

public class Task70 {

    public static int climbingStairs(int n) {

        if (n <= 3) return n;

        int one = 1;
        int two = 2;
        int countVariants = 0;

        for  (int i = 3; i<= n; i++) {
            countVariants = one + two;
            one = two;
            two = countVariants;
        }

        return countVariants;
    }
}
