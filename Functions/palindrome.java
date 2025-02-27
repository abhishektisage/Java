import java.util.*;
public class palindrome{
    public static int palind(int num){
        int rev=0,rem;
        
        while(num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=palind(a);
        int temp=a;
        if(temp==rev){
            System.out.println("it is palindrome number");

        }
        else{
            System.out.println("it's not a palindrome number");
        }
    }
}