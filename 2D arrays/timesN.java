import java.util.*;
public class timesN {
    public static int Ntime(int arr[][], int a) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[0].length; j++) {  
                if (arr[i][j] == a) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[][] = {{4, 8, 7}, {8, 8, 7}};
        int num = 7;
        int res = Ntime(arr, num);
        System.out.println(res);  
    }
}
