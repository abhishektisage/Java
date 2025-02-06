import java.util.*;
public class Factorial{
    public static int facto(int n){
        int fac=1;
        for(int i=1 ; i<=n ; i++){
            fac=fac*i;
        }
        return fac;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int factorial=facto(num);
        System.out.println("factorial of given number is ="+factorial);
    }
}