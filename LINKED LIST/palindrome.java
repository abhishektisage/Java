public class palindrome {

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

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;

        }
        //step 1
        Node midNode=findMid(head);

        //step2
        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        //step3 
        while(right!=null){
            if(left.data !=right.data){
                return false;
            }
            left =left.next;
            right=right.next;
        }
        return true;
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
        palindrome ll = new palindrome();

        ll.print();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();

        System.out.println(ll.checkPalindrome());

        
    }
}
