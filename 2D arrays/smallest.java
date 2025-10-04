import java.util.*;
public class smallest{
    public static int small(int arr[][]){
           int min=arr[0][0];
           for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
             }
           }
           return min;
           
    }
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int smallest=small(arr);
        System.out.println("smallest number of array is "+smallest);

    }
}