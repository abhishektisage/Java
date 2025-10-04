import java.util.*;
public class pairs{
     public static void printpairs(int num[]){

        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.println("("+curr+","+num[j]+")");
            }
            System.out.println();
        }

     }
     public static void main(String args[]){
        int num[]={2,3,5,6,7,8,17};
        printpairs(num);
     }
}


