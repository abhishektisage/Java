import java.util.*;
public class forbreak{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int i;

            for(i=1 ; i<=n ; i++){
                 
                 if(i==7){
                    break;
                 }
                 System.out.println(i);
            }
            System.out.println("i am out of the loop");
    }
}