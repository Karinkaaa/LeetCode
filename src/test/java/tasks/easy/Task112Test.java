package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task112.TreeNode;
import static tasks.easy.Task112.hasPathSum;

public class Task112Test {

    @Test
    public void hasPathSumTest() {

        TreeNode treeNode = new TreeNode(5);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(8);
        TreeNode leftLeft = new TreeNode(11);
        TreeNode rightRight = new TreeNode(4);

        treeNode.left = left;
        treeNode.right = right;

        left.left = leftLeft;
        right.left = new TreeNode(13);

        right.right = rightRight;

        leftLeft.left = new TreeNode(7);
        leftLeft.right = new TreeNode(2);

        rightRight.right = new TreeNode(1);

        int target = 22;

        Assert.assertTrue(hasPathSum(treeNode, target));
    }

    @Test
    public void hasPathSumTest2() {
        Assert.assertFalse(hasPathSum(null, 1));
    }

    @Test
    public void hasPathSumTest3() {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);

        Assert.assertFalse(hasPathSum(treeNode, 1));
    }

    @Test
    public void hasPathSumTest4() {

        TreeNode treeNode = new TreeNode(1);
        Assert.assertTrue(hasPathSum(treeNode, 1));
    }

    @Test
    public void hasPathSumTest5() {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);

        Assert.assertFalse(hasPathSum(treeNode, 0));
    }

    @Test
    public void hasPathSumTest6() {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);

        Assert.assertFalse(hasPathSum(treeNode, 2));
    }

    @Test
    public void hasPathSumTest7() {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.left.left = new TreeNode(4);
        treeNode.left.left.left.left = new TreeNode(5);

        Assert.assertFalse(hasPathSum(treeNode, 6));
    }
}