package tasks.easy;

public class Task21 {

    public static void main(String[] args) {

        Task21.ListNode l1 = new Task21.ListNode(1);
        Task21.ListNode l2 = new Task21.ListNode(4);
        Task21.ListNode l3 = new Task21.ListNode(6);

        Task21.ListNode l4 = new Task21.ListNode(2);
        Task21.ListNode l5 = new Task21.ListNode(3);
        Task21.ListNode l6 = new Task21.ListNode(5);

        l1.next = l2;
        l2.next = l3;

        l4.next = l5;
        l5.next = l6;

        ListNode res = mergeTwoLists(l1, l4);

        while (res != null) {

            System.out.println("res = " + res.val);
            res = res.next;
        }
    }

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

        @Override
        public String toString() {
            return "" + this.val;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}