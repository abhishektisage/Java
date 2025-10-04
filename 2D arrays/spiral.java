import java.util.*;
public class Spiral {
    public static void printSpiral(int arr[][]) {
        int SR = 0; // start row
        int SC = 0; // start col
        int ER = arr.length - 1; // end row
        int EC = arr[0].length - 1; // end col

        while (SR <= ER && SC <= EC) {
            // top row
            for (int j = SC; j <= EC; j++) {
                System.out.print(arr[SR][j] + " ");
            }

            // right column
            for (int i = SR + 1; i <= ER; i++) {
                System.out.print(arr[i][EC] + " ");
            }

            // bottom row
            for (int j = EC - 1; j >= SC; j--) {
                if (SR == ER) break;
                System.out.print(arr[ER][j] + " ");
            }

            // left column
            for (int i = ER - 1; i >= SR + 1; i--) {
                if (SC == EC) break;
                System.out.print(arr[i][SC] + " ");
            }

            SR++;
            SC++;
            ER--;
            EC--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printSpiral(arr);
    }
}
