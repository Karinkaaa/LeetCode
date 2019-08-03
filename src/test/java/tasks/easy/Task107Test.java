package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static tasks.easy.Task107.TreeNode;
import static tasks.easy.Task107.levelOrderBottom;

public class Task107Test {

    @Test
    public void levelOrderBottomTest() {

        TreeNode treeNode = new TreeNode(3);
        TreeNode rightNode = new TreeNode(20);

        treeNode.left = new TreeNode(9);
        treeNode.right = rightNode;

        rightNode.left = new TreeNode(15);
        rightNode.right = new TreeNode(7);

        List<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(7);

        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(20);

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        Assert.assertEquals(lists, levelOrderBottom(treeNode));
    }

    @Test
    public void levelOrderBottomTest2() {
        Assert.assertEquals(new ArrayList<>(), levelOrderBottom(null));
    }

    @Test
    public void levelOrderBottomTest3() {

        TreeNode treeNode = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(3);

        leftNode.left = new TreeNode(4);
        rightNode.right = new TreeNode(5);

        treeNode.left = leftNode;
        treeNode.right = rightNode;

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        Assert.assertEquals(lists, levelOrderBottom(treeNode));
    }
}