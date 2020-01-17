package tasks.easy;

public class Task83 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public boolean equals(Object obj) {

            if (obj instanceof ListNode) {

                ListNode other = (ListNode) obj;
                boolean equalsDeep = (other.next == null && this.next == null) ||
                        (this.next != null && this.next.equals(other.next));

                return other.val == this.val && equalsDeep;
            }
            return false;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode tempListNode = new ListNode(head.val);
        ListNode resListNode = tempListNode;

        while (head.next != null) {

            if (head.val != head.next.val) {

                tempListNode.next = new ListNode(head.next.val);
                tempListNode = tempListNode.next;
            }
            head = head.next;
        }

        return resListNode;
    }
}
