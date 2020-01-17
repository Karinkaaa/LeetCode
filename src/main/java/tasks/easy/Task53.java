package tasks.easy;

import java.util.Arrays;

public class Task53 {

    public static int maxSubArray(int[] nums) {

        int sum, maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            sum = nums[i];

            for (int j = i + 1; j < nums.length; j++) {

                sum += nums[j];

                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }

        int maxValue = Arrays.stream(nums).max().getAsInt();

        return maxValue > maxSum ? maxValue : maxSum;
    }
}
