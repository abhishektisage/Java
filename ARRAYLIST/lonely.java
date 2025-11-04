import java.util.*;

public class lonely {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums); // sort the list
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i);
            boolean isLonely = true;

            // Check left neighbor
            if (i > 0 && (nums.get(i - 1) == x || nums.get(i - 1) == x - 1)) {
                isLonely = false;
            }

            // Check right neighbor
            if (i < nums.size() - 1 && (nums.get(i + 1) == x || nums.get(i + 1) == x + 1)) {
                isLonely = false;
            }

            if (isLonely) {
                result.add(x);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 6, 5, 8));
        System.out.println("Lonely numbers: " + findLonely(nums));
    }
}
