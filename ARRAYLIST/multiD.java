import java.util.*;
public class multiD {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        // Fill lists
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }

        // Add all lists into mainList
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Print using nested loops
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        // Optional: print mainList directly
        System.out.println("\nMain list: " + mainList);
    }
}
