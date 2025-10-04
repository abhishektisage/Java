import java.util.*;
public class largest{
    public static int lar(int arr[][]){
           int max=arr[0][0];
           for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
             }
           }
           return max;
           
    }
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int largest=lar(arr);
        System.out.println("largest number of array is "+largest);

    }
}