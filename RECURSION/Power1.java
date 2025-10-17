import java.util.*;
public class Power1{
    public static int pow(int x,int n){
       if(n==0){
        return 1;
       }
       
       int halfpower=pow(x,n/2);
       int halfpowerSq=halfpower*halfpower;

       if(n%2!=0){
        halfpowerSq=x*halfpowerSq;
       }
       return halfpowerSq;

    }
    public static void main(String args[]){
        int x=5;
        int n=3;
        System.out.println(pow(x,n));
    }
}