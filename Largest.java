import java.util.*;
public class Largest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        
        if(A>=B){
            System.out.println("the largest number is A\t"+ A);
        }
        else{
            System.out.println("the largest number is B\t"+ B);
        }
    }
}