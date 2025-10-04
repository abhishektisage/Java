import java.util.*;

public class trapwater {
    public static int traprain(int h[]) {
        int n = h.length;
        if (n == 0) return 0;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        // Fill leftMax
        leftMax[0] = h[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(h[i], leftMax[i - 1]);
        }

        // Fill rightMax
        rightMax[n - 1] = h[n - 1];  // FIXED HERE
        for (int i = n - 2; i >= 0; i--) {  // FIXED HERE
            rightMax[i] = Math.max(h[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += waterlevel - h[i];
        }

        return trappedwater;
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(traprain(height));  
    }
}
