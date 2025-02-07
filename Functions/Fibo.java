public class Fibo{
    public static void printFibonacci(int count) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i < count; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int count = 10;
        printFibonacci(count);
    }
}
