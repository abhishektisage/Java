import java.util.*;
public class Reverse1{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ld;

        while(num>0){
            ld=num%10;
            System.out.print(ld);
            num=num/10;

        }

    }
}