package linked_lists;

public class listCycle {

    //  find cycle and then iterate from their to reach a meeting point
    public static ListNode detectCycle(ListNode head) {
        ListNode meet = findCycle(head);
        ListNode start = head;

        if (meet == null) return meet;

        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }

        return start;
    }

    //  floyd's algo to detect cycle
    public static ListNode findCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return slow;
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        ListNode head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n3;

        ListNode cycle = detectCycle(head);
        System.out.println(cycle.val);
    }
}
