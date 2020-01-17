package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task108.TreeNode;
import static tasks.easy.Task108.sortedArrayToBST;

public class Task108Test {

    @Test
    public void sortedArrayToBSTTest() {

        int[] nums = new int[]{-10, -3, 0, 5, 9};

        TreeNode treeNode = new TreeNode(-3);
        TreeNode rightNode = new TreeNode(5);

        rightNode.left = new TreeNode(0);
        rightNode.right = new TreeNode(9);

        treeNode.left = new TreeNode(-10);
        treeNode.right = rightNode;

        Assert.assertEquals(treeNode, sortedArrayToBST(nums));
    }

    @Test
    public void sortedArrayToBSTTest2() {
        Assert.assertNull(sortedArrayToBST(new int[]{}));
    }

    @Test
    public void sortedArrayToBSTTest3() {

        int[] nums = new int[]{1};

        Assert.assertEquals(new TreeNode(1), sortedArrayToBST(nums));
    }

    @Test
    public void sortedArrayToBSTTest4() {

        int[] nums = new int[]{1, 5};

        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(5);

        Assert.assertEquals(treeNode, sortedArrayToBST(nums));
    }

    @Test
    public void sortedArrayToBSTTest5() {

        int[] nums = new int[]{0, 1, 2, 3, 4, 5};

        TreeNode treeNode = new TreeNode(3);
        TreeNode leftNode = new TreeNode(1);
        TreeNode rightNode = new TreeNode(5);

        leftNode.left = new TreeNode(0);
        leftNode.right = new TreeNode(2);

        rightNode.left = new TreeNode(4);

        treeNode.left = leftNode;
        treeNode.right = rightNode;

        Assert.assertEquals(treeNode, sortedArrayToBST(nums));
    }
}