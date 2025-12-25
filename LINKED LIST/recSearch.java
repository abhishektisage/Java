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

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;

        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    // recursive search
    public int recSearch(int key) {
        return helper(head,key);
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

        System.out.println("Index of 3: " + ll.recSearch(3)); // FIXED
        System.out.println("Index of 5: " + ll.recSearch(5));
    }
}
