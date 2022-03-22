package linked_lists;

public class kthNodeFromMiddle {

    public static int findKthNodeFromMiddle(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode cur = head;

        //  adding a delay; when k reaches less than equal to 0, we'll move the cur pointer
        while (fast != null && fast.next != null) {
            if (k <= 0) cur = cur.next;

            slow = slow.next;
            fast = fast.next.next;
            k--;
        }

        return k > 0 ? -1 : cur.val;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(16);
        ListNode n7 = new ListNode(15);
        ListNode n8 = new ListNode(61);
        ListNode n9 = new ListNode(16);

        ListNode head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        System.out.println(findKthNodeFromMiddle(head, 3));
    }
}
