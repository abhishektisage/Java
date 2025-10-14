import java.util.*;

public class printInc {
    public static void Inc(int n) {
        if (n == 1) {
            System.out.print(1 +" ");
            return;
        }
        Inc(n - 1);
         System.out.print(n+" ");
    }

    public static void main(String args[]) {
        int n = 10;
        Inc(n);
    }
}
