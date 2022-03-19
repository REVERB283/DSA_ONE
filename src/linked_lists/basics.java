package linked_lists;

public class basics {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public static Node insert(Node head, int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node prev = head;
        for (int i = 0; i < pos - 1; i++)
            prev = prev.next;

        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }

    public static Node delete(Node head, int pos) {
        if (pos == 0) {
            head = head.next;
            return head;
        }

        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node cur = head;

        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(7);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        display(head);

        head = insert(head, 9, 1);
        display(head);

        head = delete(head, 1);
        display(head);

        head = reverse(head);
        display(head);
    }
}
