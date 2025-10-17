import java.util.*;
public class tiling{
    public static int tile(int n){
        if(n==0||n==1){
            return 1;
        }

          //vertical choice
          int fnm1=tile(n-1);

          //horizontal
          int fnm2=tile(n-2);

          int totWays=fnm1+fnm2;

          return totWays;
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(tile(n));
    }
}