import java.util.*;
public class average{
    public static float avg(int x,int y,int z){
        int s=x+y+z;
        float avg;
        avg=s/3;
        return avg;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c =sc.nextInt();
        
        float average=avg(a,b,c);
        System.out.println("average of given numbers is"+average);
        
    }
}