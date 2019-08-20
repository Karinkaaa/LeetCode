package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task168.convertToTitle;

public class Task168Test {

    @Test
    public void convertToTitleTest() {
        Assert.assertEquals("A", convertToTitle(1));
    }

    @Test
    public void convertToTitleTest2() {
        Assert.assertEquals("AB", convertToTitle(28));
    }

    @Test
    public void convertToTitleTest3() {
        Assert.assertEquals("ZY", convertToTitle(701));
    }

    @Test
    public void convertToTitleTest4() {
        Assert.assertNull(convertToTitle(0));
    }

    @Test
    public void convertToTitleTest5() {
        Assert.assertEquals("AZ", convertToTitle(52));
    }

    @Test
    public void convertToTitleTest6() {
        Assert.assertEquals("AAA", convertToTitle(703));
    }

    @Test
    public void convertToTitleTest7() {
        Assert.assertEquals("AAZ", convertToTitle(728));
    }
}