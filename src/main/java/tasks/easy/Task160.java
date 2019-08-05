package tasks.easy;

public class Task160 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public boolean equals(Object obj) {

            if (obj instanceof ListNode) {

                ListNode other = (ListNode) obj;

                boolean isEqualsValues = this.val == other.val;
                boolean bothNextNull = this.next == null && other.next == null;
                boolean bothNextAreNotNull = this.next != null && other.next != null;
                boolean depthEquals = bothNextNull || (bothNextAreNotNull && this.next.equals(other.next));

                return isEqualsValues && depthEquals;
            }
            return false;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tmpHeadA = headA;
        ListNode tmpHeadB = headB;

        while (tmpHeadA != null) {

            if (tmpHeadA.val == 0 && tmpHeadA.next != null)
                tmpHeadA = tmpHeadA.next.next;

            tmpHeadB = headB;

            while (tmpHeadB != null) {

                if (tmpHeadB.val == 0 && tmpHeadB.next != null)
                    tmpHeadB = tmpHeadB.next.next;

                if (tmpHeadA.val == tmpHeadB.val) {

                    if (isEqualsNodes(tmpHeadA, tmpHeadB))
                        return tmpHeadA;
                }
                tmpHeadB = tmpHeadB.next;
            }
            tmpHeadA = tmpHeadA.next;
        }

        return null;
    }

    private static boolean isEqualsNodes(ListNode listNode1, ListNode listNode2) {

        while (listNode1 != null && listNode2 != null) {

            if (listNode1.val != listNode2.val) return false;

            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
        return true;
    }
}
