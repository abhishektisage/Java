import java.util.*;
public class sumR{
    public static int Sum(int arr[][]){
        int sum=0;
        int row=1;
        for(int j=0;j<arr[0].length;j++){
            sum+=arr[row][j];
        }
        return sum;

    }
    public static void main(String args[]){
        int arr[][]={{1,4,9},
                     {11,4,3},
                     {2,2,3}};
        int s=Sum(arr);
        System.out.println(s);
    }
}