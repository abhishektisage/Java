import java.util.*;

public class StackAL{

    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        // Push
        public void push(int data) {
            list.add(data);
        }

        // Pop
        public int pop() {
            if (list.size() == 0) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public int peek() {
            if (list.size() == 0) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

        // isEmpty
        public boolean isEmpty() {
            return list.size() == 0;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}