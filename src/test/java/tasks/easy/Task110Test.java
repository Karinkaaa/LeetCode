package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task110.*;

public class Task110Test {

    @Test
    public void isBalancedTest() {

        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);

        TreeNode right = new TreeNode(20);
        treeNode.right = right;

        right.left = new TreeNode(15);
        right.right = new TreeNode(7);

        Assert.assertTrue(isBalanced(treeNode));
    }

    @Test
    public void isBalancedTest2() {

        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode leftLeft = new TreeNode(3);

        treeNode.left = left;
        treeNode.right = new TreeNode(2);

        left.left = leftLeft;
        left.right = new TreeNode(2);

        leftLeft.left = new TreeNode(4);
        leftLeft.right = new TreeNode(3);

        Assert.assertFalse(isBalanced(treeNode));
    }

    @Test
    public void isBalancedTest3() {
        Assert.assertTrue(isBalanced(null));
    }

    @Test
    public void isBalancedTest4() {

        TreeNode treeNode = new TreeNode(5);
        Assert.assertTrue(isBalanced(treeNode));
    }

    @Test
    public void isBalancedTest5() {

        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);

        Assert.assertTrue(isBalanced(treeNode));
    }

    @Test
    public void isBalancedTest6() {

        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode leftLeft = new TreeNode(3);
        TreeNode rightRight = new TreeNode(3);

        treeNode.left = left;
        treeNode.right = right;

        left.left = leftLeft;
        right.right = rightRight;

        leftLeft.left = new TreeNode(4);
        rightRight.right = new TreeNode(4);

        Assert.assertFalse(isBalanced(treeNode));
    }
}