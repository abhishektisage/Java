import java.util.*;
public class diagonalSum{
    public static int dS(int arr[][]){
        int sum=0;
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                if(i==j){
                    sum+=arr[i][j];

                }
                else if(i+j==arr.length-1){
                   sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16 }};
        int sum=dS(arr);
        System.out.println(sum);
                    
    }
}