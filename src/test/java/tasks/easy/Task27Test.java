package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task27.removeElement;

public class Task27Test {

    @Test
    public void removeElementTest() {

        Assert.assertEquals(2, removeElement(new int[]{1, 2, 3}, 2));
    }
}