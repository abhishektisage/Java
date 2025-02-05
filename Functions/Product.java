import java.util.*;
public class Product{
    public static int multiply(int num1 ,int num2){
        int prod=num1*num2;
        System.out.println("mul is "+ prod);
        return prod;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=multiply(a,b);
        
    }
}