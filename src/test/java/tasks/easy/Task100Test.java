package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task100.isSameTree;

public class Task100Test {

    @Test
    public void isSameTreeTest() {

        Task100.TreeNode treeNode = new Task100.TreeNode(1);
        treeNode.left = new Task100.TreeNode(2);
        treeNode.right = new Task100.TreeNode(3);

        Task100.TreeNode treeNode2 = new Task100.TreeNode(1);
        treeNode2.left = new Task100.TreeNode(2);
        treeNode2.right = new Task100.TreeNode(3);

        Assert.assertTrue(isSameTree(treeNode, treeNode2));
    }

    @Test
    public void isSameTreeTest2() {

        Task100.TreeNode treeNode = new Task100.TreeNode(1);
        treeNode.left = new Task100.TreeNode(2);

        Task100.TreeNode treeNode2 = new Task100.TreeNode(1);
        treeNode2.right = new Task100.TreeNode(2);

        Assert.assertFalse(isSameTree(treeNode, treeNode2));
    }

    @Test
    public void isSameTreeTest3() {

        Task100.TreeNode treeNode = new Task100.TreeNode(1);
        treeNode.left = new Task100.TreeNode(2);
        treeNode.right = new Task100.TreeNode(1);

        Task100.TreeNode treeNode2 = new Task100.TreeNode(1);
        treeNode2.left = new Task100.TreeNode(1);
        treeNode2.right = new Task100.TreeNode(2);

        Assert.assertFalse(isSameTree(treeNode, treeNode2));
    }

    @Test
    public void isSameTreeTest4() {

        Task100.TreeNode treeNode = new Task100.TreeNode(1);

        Task100.TreeNode treeNode2 = new Task100.TreeNode(1);
        treeNode2.left = new Task100.TreeNode(1);
        treeNode2.right = new Task100.TreeNode(2);

        Assert.assertFalse(isSameTree(treeNode, treeNode2));
    }

    @Test
    public void isSameTreeTest5() {

        Task100.TreeNode treeNode = new Task100.TreeNode(1);
        Task100.TreeNode treeNode2 = new Task100.TreeNode(1);

        Assert.assertFalse(isSameTree(null, treeNode));
    }
}