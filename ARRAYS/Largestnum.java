import java.util.*;
public class Largestnum{
    public static int Largestnum(int n[]){
        int largest=0;
        for(int i=0;i<n.length;i++){
            if(largest<n[i]){
                largest=n[i];
            }
        }
        return largest;

    }
    public static void main (String args[]){
        int n[]={1,2,3,4,5,6,7};
        int lar=Largestnum(n);

        System.out.println("largest number of array is "+lar);
    }
}