class CircularLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Add node
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Remove node by value
    void remove(int key) {

        // Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        Node prev = tail;

        // If head needs to be deleted
        if (head.data == key) {

            // Single node case
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // Search for node
        do {
            prev = curr;
            curr = curr.next;

            if (curr.data == key) {
                prev.next = curr.next;

                // If tail is deleted
                if (curr == tail) {
                    tail = prev;
                }
                return;
            }

        } while (curr != head);

        System.out.println("Element not found");
    }

    // Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.add(40);

        cll.display();

        cll.remove(10);  // remove head
        cll.display();

        cll.remove(30);  // remove middle
        cll.display();

        cll.remove(40);  // remove tail
        cll.display();
    }
}
