public class arith{
    
    public static int addNumbers(int a, int b) {
        return a + b;
    }

  
    public static int subtractNumbers(int a, int b) {
        return a - b;
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static double divideNumbers(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
     public static void main(String[] args) {
      
        int sum = addNumbers(5, 10);
        System.out.println("The sum is: " + sum);

    
        int difference = subtractNumbers(15, 5);
        System.out.println("The difference is: " + difference);

     
        int product = multiplyNumbers(4, 3);
        System.out.println("The product is: " + product);

       
        double quotient = divideNumbers(20, 4);
        System.out.println("The quotient is: " + quotient);
     }
}