package linked_lists;

public class insertionSortList {

    public static ListNode sort(ListNode head) {
        ListNode result = new ListNode(head.val);
        ListNode next = head.next;

        while (next != null) {
            ListNode cur = result;
            ListNode prev = null;
            boolean nodePlaced = false;

            while (cur != null) {
                if (next.val < cur.val) {
                    ListNode temp = new ListNode(next.val);
                    temp.next = cur;

                    if (prev != null) prev.next = temp;
                    else result = temp;

                    nodePlaced = true;
                    break;
                }

                prev = cur;
                cur = cur.next;
            }

            if (!nodePlaced) prev.next = new ListNode(next.val);

            next = next.next;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(2);

        ListNode head = n1;
        head.next = n2;
        n2.next = n3;

        mergeTwoSortedLists.display(sort(head));
    }
}
