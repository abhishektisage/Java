import java.util.Stack;

public class PushBottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Remove top element
        int top = s.pop();

        // Recursive call
        pushAtBottom(s, data);

        // Push back removed element
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);
        pushAtBottom(s, 5);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}