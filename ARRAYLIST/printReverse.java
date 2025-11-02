import java.util.*;
public class PrintReverse {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);  // fixed typo (was list.adguvd)
        list.add(6);
        list.add(7);

        System.out.println("Original List: " + list);

        System.out.print("Reversed List: ");
        for (int i = list.size()-1; i >= 0; i--) {  // fixed loop range
            System.out.print(list.get(i) + " ");
        }
    }
}
