class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeKLists {

    // merge two sorted lists
    static Node mergeTwo(Node a, Node b) {
        Node dummy = new Node(-1);
        Node curr = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }

        if (a != null) curr.next = a;
        if (b != null) curr.next = b;

        return dummy.next;
    }

    // merge k lists
    static Node mergeKLists(Node[] arr) {
        Node result = null;

        for (int i = 0; i < arr.length; i++) {
            result = mergeTwo(result, arr[i]);
        }

        return result;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node[] arr = new Node[3];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);

        arr[1] = new Node(6);
        arr[1].next = new Node(8);

        arr[2] = new Node(9);
        arr[2].next = new Node(10);

        Node head = mergeKLists(arr);
        printList(head);
    }
}
