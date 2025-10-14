import java.util.*;

public class printDec {
    public static void Dec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        Dec(n - 1);
    }

    public static void main(String args[]) {
        int n = 10;
        Dec(n);
    }
}
