import java.util.*;
public class primeRange{
    public static boolean isPrime(int n ){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;

            }
        }
        return true;
    }
    public static void range(int n){
        for(int i=2; i<=n ;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        range(num);
    }
}