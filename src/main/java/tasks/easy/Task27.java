package tasks.easy;

public class Task27 {

    public static int removeElement(int[] nums, int val) {

        if (nums.length == 0) return 0;

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {
                continue;
            }
            nums[count++] = nums[i];
        }

        return count;
    }
}
