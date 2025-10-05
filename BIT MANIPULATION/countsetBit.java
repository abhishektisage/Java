import java.util.*;
public class countsetBit{
    public static int countSet(int n){
         int count=0;
         while(n>0){
            if((n&1 )!= 0){
                count++;
            }
            n=n>>1;
         }
         return count;
    }
    public static void main(String args[]){
        int n=15;
        System.out.println(countSet(n));
    }
}