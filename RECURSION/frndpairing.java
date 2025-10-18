import java.util.*;
public class frndpairing{
    public static int pair(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1=pair(n-1);
        int fnm2=pair(n-2);
        int pairWays=(n-1)*fnm2;
        int totWays=fnm1+pairWays;

        return totWays;
    }

    public static void main(String args[]){
        int n=3;
        System.out.println(pair(n));
    }
}