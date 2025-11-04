import java.util.*;

public class monotonic{
    public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                decreasing = false; // not decreasing
            }
            if (list.get(i) > list.get(i + 1)) {
                increasing = false; // not increasing
            }
        }

        return increasing || decreasing; // true if either condition holds
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println("ArrayList: " + list);
        System.out.println("Is Monotonic? " + isMonotonic(list));
    }
}
