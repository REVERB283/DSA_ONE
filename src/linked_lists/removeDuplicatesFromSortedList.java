package linked_lists;

public class removeDuplicatesFromSortedList {

    public static ListNode removeDuplicates(ListNode head) {
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) cur.next = cur.next.next;
            else cur = cur.next;
        }

        return head;
    }

    public static ListNode removeDuplicates2(ListNode head) {
        ListNode cur = head;
        ListNode newList = new ListNode(0);
        newList.next = head;
        ListNode prev = newList;

        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) cur = cur.next;

            if (prev.next == cur) prev = prev.next;
            else prev.next = cur.next;

            cur = cur.next;
        }

        return newList.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(3);

        ListNode head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        mergeTwoSortedLists.display(head);

        head = removeDuplicates2(head);

        mergeTwoSortedLists.display(head);
    }
}
