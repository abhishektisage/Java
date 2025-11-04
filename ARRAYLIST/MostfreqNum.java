import java.util.*;

public class MostfreqNum {
    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        ArrayList<Integer> afterKey = new ArrayList<>();

        // Step 1: collect all numbers that come after the key
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                afterKey.add(nums.get(i + 1));
            }
        }

        // Step 2: find the number that appears most often
        int maxCount = 0;
        int result = -1;

        for (int i = 0; i < afterKey.size(); i++) {
            int count = 0;
            for (int j = 0; j < afterKey.size(); j++) {
                if (afterKey.get(i).equals(afterKey.get(j))) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                result = afterKey.get(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 100, 200, 1, 100));
        int key = 1;

        System.out.println("Most frequent number after " + key + ": " + mostFrequent(nums, key));
    }
}
