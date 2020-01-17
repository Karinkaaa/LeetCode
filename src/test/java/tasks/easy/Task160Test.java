package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task160.ListNode;
import static tasks.easy.Task160.getIntersectionNode;

public class Task160Test {

    @Test
    public void getIntersectionNodeTest() {

        ListNode listNode = new ListNode(4);
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        listNode.next = node;
        node.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode listNode2 = new ListNode(5);
        ListNode node5 = new ListNode(0);
        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(8);
        ListNode node8 = new ListNode(4);
        ListNode node9 = new ListNode(5);

        listNode2.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        Assert.assertEquals(node2, getIntersectionNode(listNode, listNode2));
    }

    @Test
    public void getIntersectionNodeTest2() {

        ListNode listNode = new ListNode(0);
        ListNode node = new ListNode(9);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);

        listNode.next = node;
        node.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode listNode2 = new ListNode(3);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(4);

        listNode2.next = node5;
        node5.next = node6;

        Assert.assertEquals(node3, getIntersectionNode(listNode, listNode2));
    }

    @Test
    public void getIntersectionNodeTest3() {

        ListNode listNode = new ListNode(2);
        ListNode node = new ListNode(6);
        ListNode node2 = new ListNode(4);

        listNode.next = node;
        node.next = node2;

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(5);

        Assert.assertNull(getIntersectionNode(listNode, listNode2));
    }

    @Test
    public void equalsTest() {

        ListNode listNode = new ListNode(2);
        ListNode listNode2 = new ListNode(2);

        Assert.assertEquals(listNode, listNode2);
    }
}