package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task104.maxDepth;
import static tasks.easy.Task104.TreeNode;

public class Task104Test {

    @Test
    public void maxDepthTest() {

        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);

        TreeNode rightNode = new TreeNode(20);
        rightNode.left = new TreeNode(15);
        rightNode.right = new TreeNode(7);

        treeNode.right = rightNode;

        Assert.assertEquals(3, maxDepth(treeNode));
    }

    @Test
    public void maxDepthTest2() {
        Assert.assertEquals(0, maxDepth(null));
    }

    @Test
    public void maxDepthTest3() {
        Assert.assertEquals(1, maxDepth(new TreeNode(3)));
    }

    @Test
    public void maxDepthTest4() {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);

        Assert.assertEquals(2, maxDepth(treeNode));
    }

    @Test
    public void maxDepthTest5() {

        TreeNode treeNode = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(-7);
        TreeNode node4 = new TreeNode(-6);
        TreeNode node5 = new TreeNode(-7);
        TreeNode node6 = new TreeNode(-5);
        TreeNode node7 = new TreeNode(-4);

        treeNode.left = node1;
        treeNode.right = node2;
        node1.left = node3;
        node3.left = node5;
        node1.right = node4;
        node4.right = node6;
        node6.right = node7;

        Assert.assertEquals(5, maxDepth(treeNode));
    }
}