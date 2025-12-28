public class LinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail
    static Node head;
    static Node tail;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Add in middle (at index)
    public void addInMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first element
    public void removeFirst() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
    }

    // Remove last element
    public void removeLast() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    // Remove from middle (at index)
    public void removeFromMiddle(int index) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;
    }

    // Print Linked List
    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();          // 1 -> 2 -> 4 -> 5 -> null

        ll.addInMiddle(2, 3);
        ll.print();          // 1 -> 2 -> 3 -> 4 -> 5 -> null

        ll.removeFromMiddle(2);
        ll.print();          // 1 -> 2 -> 4 -> 5 -> null

        ll.removeFirst();
        ll.print();          // 2 -> 4 -> 5 -> null

        ll.removeLast();
        ll.print();          // 2 -> 4 -> null
    }
}
