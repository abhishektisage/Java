import java.util.*;
public class row{
    public static void printRow(int arr[][]){
        int row=1;
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[row][j]+" ");
        }

    }
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        printRow(arr);
    }
}