package linked_lists;

public class mergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode head = new ListNode(0);
        ListNode mergedList = head;

        while (A != null && B != null) {
            if (A.val <= B.val) {
                mergedList.next = A;
                A = A.next;
            } else {
                mergedList.next = B;
                B = B.next;
            }

            mergedList = mergedList.next;
        }

        mergedList.next = A != null ? A : B;

        return head.next;
    }

    public static void display(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(8);
        ListNode n3 = new ListNode(20);

        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(11);
        ListNode n6 = new ListNode(15);

        ListNode h1 = n1;
        h1.next = n2;
        n2.next = n3;

        ListNode h2 = n4;
        h2.next = n5;
        n5.next = n6;

        ListNode head = mergeTwoLists(h1, h2);
        display(head);
    }
}
