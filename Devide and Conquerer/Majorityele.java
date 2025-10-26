import java.util.*;

public class Majorityele {
    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            // count how many times nums[i] appears
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            // check if it is the majority element
            if (count > majorityCount) {
                return nums[i];
            }
        }

        // if no majority element (problem guarantees one exists, so this won't be used)
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element: " + majorityElement(nums1)); // Output: 2

        int[] nums2 = {3, 3, 4};
        System.out.println("Majority element: " + majorityElement(nums2)); // Output: 3
    }
}
