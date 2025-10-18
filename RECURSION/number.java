import java.util.*;

public class number {
    public static void convert(String digits[], int num) {
        if (num == 0) {
            return;
        }

        int lastdigit = num % 10;
        convert(digits, num / 10); // ✅ pass digits too
        System.out.print(digits[lastdigit] + " ");
    }

    public static void main(String args[]) {
        String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int num = 1704;
        convert(digits, num);
    }
}
