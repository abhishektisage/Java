class IntersectionLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node getIntersection(Node head1, Node head2) {

        if (head1 == null || head2 == null)
            return null;

        Node p1 = head1;
        Node p2 = head2;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = head2;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = head1;
            } else {
                p2 = p2.next;
            }
        }

        return p1;   // intersection node
    }

    public static void main(String[] args) {

        // Common nodes
        Node common = new Node(30);
        common.next = new Node(40);
        common.next.next = new Node(50);

        // First list
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = common;

        // Second list
        Node head2 = new Node(15);
        head2.next = common;

        Node result = getIntersection(head1, head2);

        if (result != null)
            System.out.println("Intersection at node with data: " + result.data);
        else
            System.out.println("No intersection");
    }
}
