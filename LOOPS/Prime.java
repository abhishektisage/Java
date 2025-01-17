import java.util.*;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("n is not a prime number");
        } else if (n == 2) {
            System.out.println("n is a prime number");
        } else {
            boolean isPrime = true;

            // Check divisors from 2 to √n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // Exit loop once a divisor is found
                }
            }

            if (isPrime) {
                System.out.println("n is a prime number");
            } else {
                System.out.println("n is not a prime number");
            }
        }
       
    }
}
