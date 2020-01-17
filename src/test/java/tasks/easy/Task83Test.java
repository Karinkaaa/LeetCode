package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task83.ListNode;
import static tasks.easy.Task83.deleteDuplicates;

public class Task83Test {

    @Test
    public void deleteDuplicatesTest() {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);

        ListNode expectedListNode = new ListNode(1);
        expectedListNode.next = new ListNode(2);

        Assert.assertEquals(expectedListNode, deleteDuplicates(listNode));
    }

    @Test
    public void deleteDuplicatesTest2() {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(3);

        ListNode expectedListNode = new ListNode(1);
        expectedListNode.next = new ListNode(2);
        expectedListNode.next.next = new ListNode(3);

        Assert.assertEquals(expectedListNode, deleteDuplicates(listNode));
    }

    @Test
    public void deleteDuplicatesTest3() {
        Assert.assertNull(deleteDuplicates(null));
    }
}