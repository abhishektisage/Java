import java.util.*;
public class OddorEven{
    public static void OddEven(int n){
          int bitmask=1;
          if((n&bitmask)==0){
            System.out.println("Even number");

          }
          else{
            System.out.println("Odd number");
          }
    }
    public static void main(String args[]){
        int n =10;
        OddEven(n);
    }
}