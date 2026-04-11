import java.util.*;

public class TrappingRainWater {

    public static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int water = 0;

        for (int i = 0; i < height.length; i++) {

            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {

                int top = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }

                int left = stack.peek();

                int distance = i - left - 1;

                int boundedHeight = Math.min(height[i], height[left]) - height[top];

                water = water + (distance * boundedHeight);
            }

            stack.push(i);
        }

        return water;
    }

    public static void main(String[] args) {

        int[] arr = {7, 0, 4, 2, 5, 0, 6, 4, 0, 6};

        int result = trap(arr);

        System.out.println("Trapped Water: " + result);
    }
}