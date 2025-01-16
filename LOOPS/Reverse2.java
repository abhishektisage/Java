import java.util.*;
public class Reverse2{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int ld;
        
        while(num>0){
            ld=num%10;
            rev=(rev*10)+ld;
            num=num/10;
        }
        System.out.println("the reverse num is :"+rev);
    }
}