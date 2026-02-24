import java.util.*;

public class stackArr{
    static class Stack {
        int arr[];
        int top;
        int size;

        // Constructor
        Stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }

        // isEmpty
        public boolean isEmpty() {
            return top == -1;
        }

        // isFull
        public boolean isFull() {
            return top == size - 1;
        }

        // Push operation
        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            top++;
            arr[top] = data;
        }

        // Pop operation
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int value = arr[top];
            top--;
            return value;
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}