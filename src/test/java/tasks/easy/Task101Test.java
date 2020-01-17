package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task101.isSymmetric;

public class Task101Test {

    @Test
    public void isSymmetricTest() {

        Task101.TreeNode treeNode = new Task101.TreeNode(1);
        Task101.TreeNode left = new Task101.TreeNode(2);
        Task101.TreeNode right = new Task101.TreeNode(2);

        treeNode.left = left;
        treeNode.right = right;

        left.left = new Task101.TreeNode(3);
        left.right = new Task101.TreeNode(4);

        right.left = new Task101.TreeNode(4);
        right.right = new Task101.TreeNode(3);

        Assert.assertTrue(isSymmetric(treeNode));
    }

    @Test
    public void isSymmetricTest2() {

        Task101.TreeNode treeNode = new Task101.TreeNode(1);
        Task101.TreeNode left = new Task101.TreeNode(2);
        Task101.TreeNode right = new Task101.TreeNode(2);

        treeNode.left = left;
        treeNode.right = right;

        left.right = new Task101.TreeNode(3);
        right.right = new Task101.TreeNode(3);

        Assert.assertFalse(isSymmetric(treeNode));
    }

    @Test
    public void isSymmetricTest3() {

        Task101.TreeNode treeNode = new Task101.TreeNode(1);
        Assert.assertTrue(isSymmetric(treeNode));
    }

    @Test
    public void isSymmetricTest4() {
        Assert.assertTrue(isSymmetric(null));
    }

    @Test
    public void isSymmetricTest5() {

        Task101.TreeNode treeNode = new Task101.TreeNode(1);
        Task101.TreeNode left = new Task101.TreeNode(2);
        Task101.TreeNode right = new Task101.TreeNode(2);

        treeNode.left = left;
        treeNode.right = right;

        left.right = new Task101.TreeNode(3);
        right.left = new Task101.TreeNode(3);

        Assert.assertTrue(isSymmetric(treeNode));
    }
}