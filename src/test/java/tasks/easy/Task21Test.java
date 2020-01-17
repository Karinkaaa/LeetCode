package tasks.easy;

import org.junit.Assert;
import org.junit.Test;

import static tasks.easy.Task21.ListNode;
import static tasks.easy.Task21.mergeTwoLists;

public class Task21Test {

    @Test
    public void mergeTwoListsTest() {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;

        l4.next = l5;
        l5.next = l6;

        ListNode res = mergeTwoLists(l1, l4);

        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(4);
        ListNode ln3 = new ListNode(5);
        ListNode ln4 = new ListNode(2);
        ListNode ln5 = new ListNode(3);
        ListNode ln6 = new ListNode(6);

        ln1.next = ln4;
        ln4.next = ln5;
        ln5.next = ln2;
        ln2.next = ln3;
        ln3.next = ln6;

        Assert.assertEquals(ln1, res);
    }

    @Test
    public void ifParameterNullTest() {

        ListNode listNode = new ListNode(1);

        Assert.assertEquals(listNode, mergeTwoLists(null, listNode));
        Assert.assertEquals(listNode, mergeTwoLists(listNode, null));
        Assert.assertNull(mergeTwoLists(null, null));
    }
}