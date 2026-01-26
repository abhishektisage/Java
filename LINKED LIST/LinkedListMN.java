class LinkedListMN {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of linked list
    Node head;

    // Function to delete N nodes after M nodes
    void deleteNafterM(int M, int N) {
        Node curr = head;

        while (curr != null) {

            // 1️⃣ Skip M-1 nodes (retain M nodes)
            for (int i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }

            // If end of list reached
            if (curr == null) {
                return;
            }

            // 2️⃣ Delete next N nodes
            Node temp = curr.next;
            for (int i = 1; i <= N && temp != null; i++) {
                temp = temp.next;
            }

            // Link retained part to remaining list
            curr.next = temp;

            // Move curr to next retained node
            curr = temp;
        }
    }

    // Function to print linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        LinkedListMN ll = new LinkedListMN();

        // Create linked list: 1->2->3->4->5->6->7->8
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next = new Node(6);
        ll.head.next.next.next.next.next.next = new Node(7);
        ll.head.next.next.next.next.next.next.next = new Node(8);

        System.out.print("Original List: ");
        ll.printList();

        ll.deleteNafterM(2, 2);

        System.out.print("Modified List: ");
        ll.printList();
    }
}
