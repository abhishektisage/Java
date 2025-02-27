import java.util.*;

public class IntegerSum {
    public static int sum(int num) {
        int rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        int sumOfDigits = sum(a);
        System.out.println("Sum of digits: " + sumOfDigits);
    }
}
