class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class OddEvenLinkedList {

    Node head;

    // Function to rearrange even before odd
    public void oddEven() {
        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;

        Node curr = head;

        while (curr != null) {
            if (curr.data % 2 == 0) {   // even
                if (evenStart == null) {
                    evenStart = evenEnd = curr;
                } else {
                    evenEnd.next = curr;
                    evenEnd = curr;
                }
            } else {                   // odd
                if (oddStart == null) {
                    oddStart = oddEnd = curr;
                } else {
                    oddEnd.next = curr;
                    oddEnd = curr;
                }
            }
            curr = curr.next;
        }

        // If no even or no odd nodes
        if (evenStart == null) {
            head = oddStart;
            return;
        }
        if (oddStart == null) {
            head = evenStart;
            return;
        }

        // Join even and odd lists
        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;
    }

    // Print Linked List
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        OddEvenLinkedList ll = new OddEvenLinkedList();
        ll.head = new Node(8);
        ll.head.next = new Node(12);
        ll.head.next.next = new Node(10);
        ll.head.next.next.next = new Node(5);
        ll.head.next.next.next.next = new Node(4);
        ll.head.next.next.next.next.next = new Node(1);
        ll.head.next.next.next.next.next.next = new Node(6);

        ll.oddEven();
        ll.printList();
    }
}
