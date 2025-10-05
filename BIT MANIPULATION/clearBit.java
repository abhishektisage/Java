import java.util.*;
public class clearBit{
    public static int clearBit(int n , int i){
        int bitmask=~(1<<i);
        return n&bitmask;
        
    }
    public static void main(String args[]){
        int n=10;
        int i=2;
        System.out.println(clearBit(n,i));

    }
}