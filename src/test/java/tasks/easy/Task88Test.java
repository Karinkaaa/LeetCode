package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task88.merge;

public class Task88Test {

    @Test
    public void mergeTest() {

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        int[] expectedNums = new int[]{1, 2, 3, 0, 0, 0};

        merge(nums1, 8, nums2, 2);
        Assert.assertArrayEquals(expectedNums, nums1);
    }

    @Test
    public void mergeTest2() {

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        int[] expectedNums = new int[]{1, 2, 2, 3, 5, 6};
        merge(nums1, 3, nums2, 3);

        Assert.assertArrayEquals(expectedNums, nums1);
    }
}