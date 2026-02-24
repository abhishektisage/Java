import java.util.*;

public class undoRedo{

    static Stack<String> undoStack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();
    static String currentText = "";

    // Perform new action
    public static void type(String text) {
        undoStack.push(currentText);
        currentText += text;
        redoStack.clear(); // clear redo after new action
    }

    // Undo operation
    public static void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentText);
            currentText = undoStack.pop();
        } else {
            System.out.println("Nothing to Undo");
        }
    }

    // Redo operation
    public static void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentText);
            currentText = redoStack.pop();
        } else {
            System.out.println("Nothing to Redo");
        }
    }

    public static void main(String[] args) {

        type("Hello ");
        type("World");

        System.out.println("Current: " + currentText);

        undo();
        System.out.println("After Undo: " + currentText);

        redo();
        System.out.println("After Redo: " + currentText);
    }
}