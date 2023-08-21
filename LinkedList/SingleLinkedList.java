package LinkedList;

public class SingleLinkedList {
    Node head;

    // insert from First/Head
    void insertFirst(int value) {
        Node n = new Node();
        n.data = value;
        n.next = head;
        head = n;
    }

    // insert from Last/Tail
    void insertLast(int value) {

        if (head == null) {
            insertFirst(value);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node n = new Node();
            n.data = value;
            current.next = n;
        }
    }

    // insert in middle of the node
    void insertAfter(Node prev, int value) {
        if (prev == null) {

        } else {
            Node n = new Node();
            n.data = value;
            n.next = prev.next;
            prev.next = n;
        }
    }

    // delete from First/Head
    void deletFromFirst() {
        head = head.next;
    }

    // delete from Last/Tail
    void deletFromLast() {
        Node current = head;
        Node temp = current;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        temp.next = null;
    }

    // delete from any position
    void deleteNode(int pos) {
        if (head == null) {
            return;
        }
        Node current = head;
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {

        }
        Node temp = current.next.next;
        current.next = temp;
    }

    // to search any element
    void search(Node head, int ele) {
        Node current = head;
        int i = 0;
        while (current != null) {
            if (current.data == ele) {
                i = 1;
            }
            current = current.next;
        }
        if (i == 1)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }

    // Displaying element
    void display() {
        Node current = head;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        ll.insertFirst(10);
        ll.insertFirst(12);
        ll.insertFirst(15);
        // ll.deleteNode(1);
        ll.display();

        ll.insertLast(20);
        ll.insertAfter(ll.head.next.next, 6);
        ll.deleteNode(20);

        ll.display();

    }
}
