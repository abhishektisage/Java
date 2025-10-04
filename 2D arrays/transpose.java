import java.util.*;
public class transpose{
    public static void main(String args[]){
        
        int arr[][]={{1,2,3},
                     {4,5,6}};
        int row=arr.length;
        int col=arr[0].length;
        
        int trans[][]=new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                trans[j][i]=arr[i][j];
            }
        }
        System.out.println("Tranpose matrix");
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                System.out.print(trans[i][j]+" ");
            }
             System.out.println();
        }
       
        
    }
}