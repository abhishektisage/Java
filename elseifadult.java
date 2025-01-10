import java.util.*;
public class elseifadult{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int age=sc.nextInt();
        
        if(age>=18){
           System.out.println("adult");

        }
        else if(age>=13 && age<18){
            System.out.println("teenage");
        }
        else{
            System.out.println("child");
        }
    }
}