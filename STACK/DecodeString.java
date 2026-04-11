import java.util.*;

public class DecodeString {

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        String num = "";   // to store digits

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If digit
            if (ch >= '0' && ch <= '9') {
                num = num + ch;   // build number
            }

            // If opening bracket
            else if (ch == '[') {
                int k = Integer.parseInt(num); // convert to integer
                countStack.push(k);
                stringStack.push(currentString);

                // reset
                num = "";
                currentString = "";
            }

            // If closing bracket
            else if (ch == ']') {
                int count = countStack.pop();
                String prevString = stringStack.pop();

                String temp = "";
                for (int j = 0; j < count; j++) {
                    temp = temp + currentString;
                }

                currentString = prevString + temp;
            }

            // If normal character
            else {
                currentString = currentString + ch;
            }
        }

        return currentString;
    }

    public static void main(String[] args) {

        String input1 = "2[cv]";
        String input2 = "3[b2[v]]L";

        System.out.println("Output 1: " + decodeString(input1));
        System.out.println("Output 2: " + decodeString(input2));
    }
}