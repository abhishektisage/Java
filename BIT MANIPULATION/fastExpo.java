import java.util.*;
public class fastExpo{
    public static int Expo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){//check LSB
             ans=ans*a;   
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String args[]){
        int a=5;
        int n=3;
        System.out.println(Expo(a,n));
    } 
    
}