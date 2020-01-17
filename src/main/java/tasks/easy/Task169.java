package tasks.easy;

import java.util.Arrays;

public class Task169 {

    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int middle = nums.length / 2;

        return nums[middle];
    }
}
