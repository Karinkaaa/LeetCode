package tasks.easy;

public class Task136 {

    public static int singleNumber(int[] nums) {

        int count;

        for (int i = 0; i < nums.length; i++) {
            count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
            }

            if (count == 1) return nums[i];
        }
        return 0;
    }
}