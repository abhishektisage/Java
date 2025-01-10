import java.util.*;
public class Largest3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        
        if((A>=B) && (A>=C)){
            System.out.println(" largest no. is A:"+A);
        }
        else if (B>=C){
            System.out.println("largest no. is B:"+B);
        }
        else{
            System.out.println("largest no. is C:"+C);

        }

    }
}