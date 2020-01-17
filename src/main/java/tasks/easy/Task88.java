package tasks.easy;

import java.util.Arrays;

public class Task88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m > nums1.length || n > nums2.length) return;

        Arrays.copyOf(nums1, m);
        System.arraycopy(nums2, 0, nums1, m, n);

        boolean f;

        do {

            f = true;
            for (int i = 0; i < nums1.length - 1; i++) {

                if (nums1[i] > nums1[i + 1]) {

                    int tmp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = tmp;
                    f = false;
                }
            }
        } while (f == false);
    }
}
