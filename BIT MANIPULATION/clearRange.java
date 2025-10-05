import java.util.*;
public class clearRange{
    public static int Range(int n,int i,int j) {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;

    }
    public static void main(String args[]){
        int n=15;
        int i=2;
        int j=7;
        System.out.println(Range(n,i,j));
    }
}