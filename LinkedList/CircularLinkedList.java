package LinkedList;

public class CircularLinkedList {

    Node head;
    Node tail;
    int size = 0;

    void insertFirst(int value) {
        Node n = new Node();
        n.data = value;
        n.next = head;
        if (head == null) {
            head = tail = n;
            head.next = n;
        } else {
            head = n;
            tail.next = head;
        }

    }

    void insertLast(int value) {
        Node n = new Node();
        n.data = value;
        if (head == null) {
            head = tail = n;
            n.next = head;
        } else {
            tail.next = n;
            tail = n;
            tail.next = head;
        }
    }

    void insertPosition(int pos, int value) {
        Node current = new Node();
        if (current == null || pos > size) {

        } else {
            Node n = new Node();
            n.data = value;
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
            n.next = current.next;
            current.next = n;
            size++;
        }
    }

    void display() {
        Node current = head;
        if (current != null) {
            do {
                System.out.print(current.data + "\t");
                current = current.next;
            } while (current != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.insertFirst(1);
        c.insertFirst(2);
        c.insertFirst(3);
        c.insertFirst(4);
        c.display();
    }

}
