package linked_lists;

public class basics {

    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
//            this.next = null;
//            this.random = null;
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

    public static Node closeWithRandom(Node head) {
        Node cur = head;

        //  inserting new nodes as clone
        while (cur != null) {
            Node temp = cur.next;
            cur.next = new Node(cur.data);

            cur.next.next = temp;
            cur = temp;
        }

        cur = head;

        //  cloning the random pointers to the clone linked list
        while (cur != null) {
            if (cur.next != null)
                cur.next.random = cur.random != null ? cur.random.next : null;
            cur = cur.next.next;
        }

        Node original = head;
        Node clone = head.next;
        Node cloneHead = clone;

        while (original != null) {
            original.next = original.next.next;
            clone.next = clone.next != null ? clone.next.next : null;

            original = original.next;
            clone = clone.next;
        }

        return cloneHead;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
//
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
//
//        display(head);
//
//        head = insert(head, 9, 1);
//        display(head);
//
//        head = delete(head, 1);
//        display(head);
//
//        head = reverse(head);
//        display(head);

        n1.random = n3;
        n2.random = n1;
        n3.random = n2;
        n4.random = n4;
        head = closeWithRandom(head);
        display(head);

        Node cur = head;
        while (cur != null) {
            System.out.print(cur.random.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
        System.out.println();
    }
}
