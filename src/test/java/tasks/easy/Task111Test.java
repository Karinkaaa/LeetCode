package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task111.TreeNode;
import static tasks.easy.Task111.minDepth;

public class Task111Test {

    @Test
    public void minDepthTest() {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);

        Assert.assertEquals(2, minDepth(treeNode));
    }

    @Test
    public void minDepthTest2() {

        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);

        TreeNode right = new TreeNode(20);
        treeNode.right = right;

        right.left = new TreeNode(15);
        right.right = new TreeNode(7);

        Assert.assertEquals(2, minDepth(treeNode));
    }

    @Test
    public void minDepthTest3() {
        Assert.assertEquals(0, minDepth(null));
    }
}