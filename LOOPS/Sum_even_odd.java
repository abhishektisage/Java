import java.util.*;
public class Sum_even_odd{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int even=0;
        int odd=0;

        do{
            System.out.print("enter any number : ");
             number=sc.nextInt();

            if(number%2==0){
                even=even+number;
            }
            else{
                odd=odd+number;
            }

            System.out.println("do you want to continue ? Press 1 for continue and 0 for end");
            choice=sc.nextInt();
        }while(choice==1);

        System.out.println("sum of even numbers is :"+even);
        System.out.println("sum of odd number is :"+odd);

    }
}