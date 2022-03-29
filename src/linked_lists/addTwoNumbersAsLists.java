package linked_lists;

public class addTwoNumbersAsLists {

    public static ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode result = new ListNode(0);
        ListNode head = result;

        int sum = 0;
        int carry = 0;

        while (A != null || B != null) {
            sum = carry;

            if (A != null) {
                sum += A.val;
                A = A.next;
            }

            if (B != null) {
                sum += B.val;
                B = B.next;
            }

            carry = sum / 10;
            sum %= 10;

            result.next = new ListNode(sum);
            result = result.next;
        }

        if (carry == 1) result.next = new ListNode(carry);

        return head.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(8);
        ListNode n4 = new ListNode(2);

        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(5);

        ListNode A = n1;
        A.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode B = n5;
        B.next = n6;
        n6.next = n7;

        mergeTwoSortedLists.display(addTwoNumbers(A, B));
    }
}
