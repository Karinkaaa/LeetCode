package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task66.plusOne;

public class Task66Test {

    @Test
    public void plusOneTest() {

        int[] input = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 4};

        Assert.assertArrayEquals(expected, plusOne(input));
    }

    @Test
    public void plusOneTest2() {

        int[] input = new int[]{1, 2, 9};
        int[] expected = new int[]{1, 3, 0};

        Assert.assertArrayEquals(expected, plusOne(input));
    }

    @Test
    public void plusOneTest3() {

        int[] input = new int[]{9};
        int[] expected = new int[]{1, 0};

        Assert.assertArrayEquals(expected, plusOne(input));
    }

    @Test
    public void plusOneTest4() {

        int[] input = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] expected = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1};

        Assert.assertArrayEquals(expected, plusOne(input));
    }

    @Test
    public void plusOneTest5() {

        int[] input = new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        int[] expected = new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7};

        Assert.assertArrayEquals(expected, plusOne(input));
    }
}