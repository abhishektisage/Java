import java.util.*;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        // Split path
        String[] parts = path.split("/");

        // Process each part
        for (int i = 0; i < parts.length; i++) {

            if (parts[i].equals("") || parts[i].equals(".")) {
                continue;
            } 
            else if (parts[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else {
                stack.push(parts[i]);
            }
        }

        // Build result
        String result = "";

        // Using normal for loop instead of for-each
        for (int i = 0; i < stack.size(); i++) {
            result = result + "/" + stack.get(i);
        }

        // Check if empty
        if (result.length() == 0) {
            return "/";
        } else {
            return result;
        }
    }

    public static void main(String[] args) {

        String path1 = "/apnacollege/";
        String path2 = "/a/..";

        System.out.println("Simplified Path 1: " + simplifyPath(path1));
        System.out.println("Simplified Path 2: " + simplifyPath(path2));
    }
} 
