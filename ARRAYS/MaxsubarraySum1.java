import java.util.*;

public class MaxsubarraySum1 {
    public static int MaxsubarraySum(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currsum = 0;  // Reset for each subarray
                for (int k = start; k <= end; k++) {
                    currsum += num[k];
                }
                System.out.println("Subarray sum from index " + start + " to " + end + " is " + currsum);
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }

        return maxsum;
    }

    public static void main(String args[]) {
        int num[] = {1, -2, 6, -1, 3};
        int s = MaxsubarraySum(num);
        System.out.println("Sum of Maxsubarray is " + s);
    }
}
