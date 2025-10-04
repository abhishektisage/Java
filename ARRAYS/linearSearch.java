import java.util.*;

public class linearSearch {
    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) { 
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16}; 
        int key = 10;
        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is found at index " + index);
        }
    }
}
