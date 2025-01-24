import java.util.*;
public class Sum{
        public static int add(int num1,int num2){
               int add= num1 + num2;
               return add;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();

            int sum=add(a,b);
            System.out.println("sum is :"+ sum);
        }

}

