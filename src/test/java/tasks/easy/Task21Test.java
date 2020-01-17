package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task21.mergeTwoLists;

public class Task21Test {

    @Test
    public void mergeTwoListsTest() {

        Task21.ListNode l1 = new Task21.ListNode(1);
        Task21.ListNode l2 = new Task21.ListNode(2);
        Task21.ListNode l3 = new Task21.ListNode(3);

        Task21.ListNode l4 = new Task21.ListNode(4);
        Task21.ListNode l5 = new Task21.ListNode(5);
        Task21.ListNode l6 = new Task21.ListNode(6);

        l1.next = l2;
        l2.next = l3;

        l4.next = l5;
        l5.next = l6;

        Task21.ListNode res = mergeTwoLists(l1, l4);

        Task21.ListNode ln1 = new Task21.ListNode(1);
        Task21.ListNode ln2 = new Task21.ListNode(4);
        Task21.ListNode ln3 = new Task21.ListNode(5);
        Task21.ListNode ln4 = new Task21.ListNode(2);
        Task21.ListNode ln5 = new Task21.ListNode(3);
        Task21.ListNode ln6 = new Task21.ListNode(6);

        ln1.next = ln4;
        ln4.next = ln5;
        ln5.next = ln2;
        ln2.next = ln3;
        ln3.next = ln6;

        Assert.assertEquals(ln1, res);
    }

    @Test
    public void ifParameterNullTest() {

        Task21.ListNode listNode = new Task21.ListNode(1);

        Assert.assertEquals(listNode, mergeTwoLists(null, listNode));
        Assert.assertEquals(listNode, mergeTwoLists(listNode, null));
        Assert.assertNull(mergeTwoLists(null, null));
    }
}