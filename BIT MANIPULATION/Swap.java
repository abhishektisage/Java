import java.util.*;
public class Swap{
    public static void main(String args[]){
        int x=17;
        int y=28;
        System.out.println("Before swapping "+x +" and "+y);
        
        x=x^y;
        y=x^y;
        x=x^y;

        System.out.println("After swapping "+x +" and "+y);
    }
}