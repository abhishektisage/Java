import java.util.*;
public class checkPow{
    public static boolean pow(int n){
         return(n & (n-1))==0;
    }
    public static void main(String args[]){
        int n=15;
        System.out.println(pow(n));
    }
}