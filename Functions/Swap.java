import java.util.*;
public class Swap{
    public static void swap(int x,int y){
              
            int temp=x;
            x=y;
            y=temp;
            
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        swap(a,b);
        System.out.println("values of a and b after swapping ="+x  +y);
    }
}