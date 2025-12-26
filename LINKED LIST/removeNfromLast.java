public class LinkedList {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {   // FIXED
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

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

    public void delnthFrEnd(int n) {
    // calculate size
    int sz = 0;
    Node temp = head;
    while (temp != null) {
        temp = temp.next;
        sz++;
    }

    // if first node from start (i.e., nth from end == size)
    if (n == sz) {
        head = head.next;
        return;
    }

    // find (sz - n)th node
    int i = 1;
    int iToFind = sz - n;
    Node prev = head;

    while (i < iToFind) {
        prev = prev.next;
        i++;
    }

    // delete node
    prev.next = prev.next.next;
}


    // Print LinkedList
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.print();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();

        ll.delnthFrEnd(3);
        ll.print();
    }
}
