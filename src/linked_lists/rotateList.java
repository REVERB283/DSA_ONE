package linked_lists;

public class rotateList {

    public static ListNode rotate(ListNode head, int k) {
        ListNode fast = head;
        ListNode cur = head;
        int len = 0;

        //  calculating length of list
        while (fast != null) {
            fast = fast.next;
            len++;
        }

        fast = head;
        k = k % len;

        if (k == 0) return head;

        //  getting the last & (len - k) th ptr
        while (fast.next != null) {
            if (k <= 0) cur = cur.next;

            fast = fast.next;
            k--;
        }

        fast.next = head;
        head = cur.next;
        cur.next = null;

        return head;
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

        mergeTwoSortedLists.display(rotate(head, 2));
    }
}
