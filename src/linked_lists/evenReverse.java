package linked_lists;

public class evenReverse {

    public static ListNode reverseEven(ListNode head) {
        ListNode odd = head;
        ListNode even = null;

        //  separate odd & even lists (even in reverse order)
        while (odd != null && odd.next != null) {
            ListNode temp = odd.next;
            odd.next = temp.next;

            temp.next = even;
            even = temp;

            odd = odd.next;
        }

        odd = head;

        //  link both odd & reversed even lists
        while (even != null) {
            ListNode nextOdd = odd.next;
            ListNode nextEven = even.next;

            odd.next = even;
            even.next = nextOdd;

            odd = nextOdd;
            even = nextEven;
        }

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

        mergeTwoSortedLists.display(reverseEven(head));
    }
}
