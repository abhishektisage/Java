class ReverseCircularLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Add at end (helper)
    void addLast(int data) {
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

    // Reverse circular linked list
    void reverse() {

        // Empty or single node
        if (head == null || head.next == head)
            return;

        Node prev = null;
        Node curr = head;
        Node next;

        do {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } while (curr != head);

        // Fix head and tail
        tail = head;
        head = prev;
        tail.next = head;
    }

    // Display
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

        ReverseCircularLL cll = new ReverseCircularLL();

        cll.addLast(10);
        cll.addLast(20);
        cll.addLast(30);
        cll.addLast(40);

        System.out.print("Before Reverse: ");
        cll.display();

        cll.reverse();

        System.out.print("After Reverse:  ");
        cll.display();
    }
}
