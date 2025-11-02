import java.util.*;
public class Swap {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);          // store the value at idx1
        list.set(idx1, list.get(idx2));     // set idx1 to value at idx2
        list.set(idx2, temp);               // set idx2 to temp
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(3);
        list.add(8);

        int idx1 = 1, idx2 = 4;

        System.out.println("Before Swap: " + list);
        swap(list, idx1, idx2);             // perform swap
        System.out.println("After Swap: " + list);
    }
}
