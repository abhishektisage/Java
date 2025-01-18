import java.util.*;
public class Mtable{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter any number :");
        int num=sc.nextInt();
        int i;
        

        for(i=1 ; i<=10 ; i++){
            System.out.println(num+"*"+i+"=  "+num*i );
        }
                                
    }
}