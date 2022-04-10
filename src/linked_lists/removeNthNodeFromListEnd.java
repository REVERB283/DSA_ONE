package linked_lists;

public class removeNthNodeFromListEnd {

    public static ListNode removeNthNodeFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode cur = head;

        while (fast != null) {
            if (n < 0) cur = cur.next;

            fast = fast.next;
            n--;
        }

        if (n < 0) {
            cur.next = cur.next.next;
            return head;
        } else return head.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        ListNode head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        mergeTwoSortedLists.display(removeNthNodeFromEnd(head, 2));
    }
}
