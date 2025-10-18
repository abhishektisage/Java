import java.util.*;

public class binaryString{
    public static void printString(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return; // stop recursion here
        }

        printString(n - 1, 0, str + "0");

        if (lastplace == 0) {
            printString(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        int n = 3;
        printString(n, 0, ""); // just call the function
    }
}
