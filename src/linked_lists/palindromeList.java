package linked_lists;

public class palindromeList {

    //  find the middle and reverse the list from there and iterate while comparing each node to check for palindrome
    public static int isPalindrome(ListNode head) {
        ListNode mid = findMiddle(head);
        ListNode last = reverse(mid);
        ListNode start = head;

        while (last != null) {
            if (last.val != start.val) return 0;

            last = last.next;
            start = start.next;
        }

        return 1;
    }

    //  to find the middle node
    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    //  to reverse the linked list from a node
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;

            prev = cur;
            cur = temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(1);

        ListNode head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(isPalindrome(head));
    }
}

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
