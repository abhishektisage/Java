public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static boolean isCyclic(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){//cyclic exists
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //finding meeting point
        slow=head;
        Node prev =null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle..>last.next=null
        prev.next=null;
    }

    public static void main(String args[]) {
       head=new Node(1);
       Node temp=new Node(2);
       head.next=temp;
       head.next.next=new Node(3);
       head.next.next.next=temp;

       System.out.println(isCyclic());
       removeCycle();
       System.out.println(isCyclic());

    }
}
