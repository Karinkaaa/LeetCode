package tasks.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task155Test {

    MinStack minStack;

    @Before
    public void beforeEveryTest() {

        minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
    }

    @Test
    public void minStackTest() {
        Assert.assertEquals(-3, minStack.getMin());
    }

    @Test
    public void minStackTest2() {
        Assert.assertEquals(-3, minStack.top());
    }

    @Test
    public void minStackTest3() {

        minStack.push(8);
        Assert.assertEquals(8, minStack.top());
    }

    @Test
    public void minStackTest4() {

        minStack.pop();
        minStack.pop();
        Assert.assertEquals(-2, minStack.top());
    }
}