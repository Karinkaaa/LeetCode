package tasks.easy;

public class Task35 {

    public static int searchInsert(int[] nums, int target) {

        if (nums[0] > target) return 0;
        if (nums[nums.length - 1] < target) return nums.length;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < target) {
                continue;
            }
            return i;
        }
        return 0;
    }
}
