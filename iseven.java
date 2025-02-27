import java.util.*;
public class iseven{
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         boolean val=isEven(num);
         System.out.println(val);
     
    }
}