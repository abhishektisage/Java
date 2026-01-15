import java.util.*;

class LinkedListZigZag {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    static Node head;

    // Add node at end
    public static void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Print the list
    public static void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ZigZag function (your logic)
    public static void zigZag() {

        if (head == null || head.next == null) return;

        // 1. Find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // 2. Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3. ZigZag merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);

        System.out.println("Original List:");
        printList();

        zigZag();

        System.out.println("ZigZag List:");
        printList();
    }
}
